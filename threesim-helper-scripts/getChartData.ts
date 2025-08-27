#!/usr/bin/env bun

import path from "node:path"
import object from 'lodash/object';

const [sourceFile, headerFile, baseDir] = Bun.argv.slice(2);

if (!sourceFile || !headerFile || !baseDir) {
  console.error("Usage: bun getChartData.ts <source-file> <header-file> <base-dir>");
  process.exit(1);
}

const headerText = await Bun.file(headerFile).text();
const footerText = `\\end{groupplot}

  \\begin{axis}[
    hide axis,
    xmin=0, xmax=1,
    ymin=0, ymax=1,
    at={(current bounding box.south)},
    anchor=north,
    yshift=-0.5cm,
    legend columns=2,
    legend style={
        draw=none,
        fill=none,
        legend cell align=left,
        nodes={text width=2cm}
    }
]
\\addlegendimage{Navy, line width=1pt, thick}
\\addlegendentry{Net}

\\addlegendimage{orange, line width=1pt, thick}
\\addlegendentry{Ring}
\\end{axis}
\\end{tikzpicture}
\\end{figure}`

const index = await Bun.file(sourceFile).json();

async function getPair(c: string, m: string, key: string = "average", resultsSetKey: string = "averageSimulationRoundResult") {
  let output = ""
  const a = index[c]
  for (const v of a) {
    const x = v.value
    const filePath = path.join(baseDir, v.file)
    const results = await Bun.file(filePath).json()
    const outputMetric = object.get(results, resultsSetKey).find(it => it.name == m);
    const y = object.get(outputMetric, key);
    output += `(${x},${y})\n`
  }
  return output.trimEnd();
}

let output = `${headerText}

\\nextgroupplot[
    ylabel={$A_{Sca}$},
    y unit=\\si{\\%}
  ]
  \\addplot[
    color=Navy,
    line width=1pt
  ] coordinates {
${await getPair("Net", "AvailabilityScalability")}
  };
  \\addplot[
    color=orange,
    line width=1pt
  ] coordinates {
${await getPair("Ring", "AvailabilityScalability")}
  };

\\nextgroupplot[
      ylabel={$A_{Sec}$},
      y unit=\\si{\\%}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "AvailabilitySecurity")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "AvailabilitySecurity")}
    };

  \\nextgroupplot[
      ylabel={$CL$},
      y unit=\\si{\\minute},
      y filter/.code={\\pgfmathdivide{#1}{60000}} % convert from ms to min
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "AverageConfirmationLatency")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "AverageConfirmationLatency")}
    };

  \\nextgroupplot[
      ylabel={$Cons$},
      y unit=\\si{\\minute},
      y filter/.code={\\pgfmathdivide{#1}{60000}} % convert from ms to min
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "Consistency")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "Consistency")}
    };

    \\nextgroupplot[
      ylabel={$GD$},
      y unit=\\si{\\%}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "GeographicalDiversity", "value", "generalResults")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "GeographicalDiversity", "value", "generalResults")}
    };

    \\nextgroupplot[
      ylabel={$Gini$}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "GiniCoefficient")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "GiniCoefficient")}
    };

${footerText}

${headerText}

   \\nextgroupplot[
      ylabel={$HHI_{norm}$}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "HerfindahlHirschmanIndex")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "HerfindahlHirschmanIndex")}
    };

\\nextgroupplot[
      ylabel={$NC$},
      y unit={\\text{validating nodes}}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "NakamotoCoefficient", "value", "generalResults")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "NakamotoCoefficient", "value", "generalResults")}
    };

\\nextgroupplot[
      ylabel={$R$},
      y unit=\\si{\\%}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "Reliability")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "Reliability")}
    };

    \\nextgroupplot[
      ylabel={$H$},
      y unit={\\text{bits}}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "ShannonEntropy")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "ShannonEntropy")}
    };

    \\nextgroupplot[
      ylabel={$SBR$},
      y unit=\\si{blocks/\\minute}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "StaleBlockRate")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "StaleBlockRate")}
    };

    \\nextgroupplot[
      ylabel={$T_{trx}$},
      y unit=\\si{transactions/\\minute}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "Throughput")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "Throughput")}
    };

${footerText}

${headerText}

    \\nextgroupplot[
      ylabel={$FT_{\\Delta T_{trx}}$},
      y unit=\\si{transactions/\\minute}
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "FaultTolerance", "average.throughputDelta.average")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "FaultTolerance", "average.throughputDelta.average")}
    };

    \\nextgroupplot[
      ylabel={$FT_{\\Delta CL}$},
      y unit=\\si{\\minute},
      y filter/.code={\\pgfmathdivide{#1}{60000}} % convert from ms to min
    ]
    \\addplot[
      color=Navy,
      line width=1pt
    ] coordinates {
${await getPair("Net", "FaultTolerance", "average.confirmationLatencyDelta.average")}
    };
    \\addplot[
      color=orange,
      line width=1pt
    ] coordinates {
${await getPair("Ring", "FaultTolerance", "average.confirmationLatencyDelta.average")}
    };

${footerText}
`;
console.log(output)
