#!/usr/bin/env bun

import path from "node:path"
import object from 'lodash/object';

const [sourceFile, name, config] = Bun.argv.slice(2);

if (!sourceFile || !name || !config) {
  console.error("Usage: bun getCorrelationData.ts <source-file> <name> <config>");
  process.exit(1);
}

const sourcePath = path.parse(sourceFile).dir

try {
  console.log()
  const index = await Bun.file(sourceFile).json();
  const a = index[config];
  const keys = ["averageSimulationRoundResult", "generalResults"]
  let i = 0;
  for (const v of a) {
    const x = v.value
    const filePath = path.join(sourcePath, v.file)
    const results = await Bun.file(filePath).json()

    let outputMetrics = []
    for (const k of keys) {
      outputMetrics.push(...object.get(results, k))
    }

    if (i === 0) {
      let headers = []
      for (const o of outputMetrics) {
        if (o.name === "FaultTolerance") {
          headers.push("FT.TD")
          headers.push("FT.CLD")
        } else {
          headers.push(o.name)
        }
      }
      const headersStr = headers.join(",")
      console.log(`${name},${headersStr}`);
    }
    i++

    let outputStr = `${x}`
    for (const m of outputMetrics) {
      if (m.name === "FaultTolerance") {
        const y1 = object.get(m, "average.throughputDelta.average")
        const y2 = object.get(m, "average.confirmationLatencyDelta.average")
        outputStr += `,${y1},${y2}`
      } else if (m.name === "GeographicalDiversity" || m.name === "NakamotoCoefficient") {
        const y = object.get(m, "value");
        outputStr += `,${y}`
      } else {
        const y = object.get(m, "average");
        outputStr += `,${y}`
      }
    }
    console.log(outputStr)
  }
  console.log()
} catch (error) {
  console.error("Error:", error);
  process.exit(1);
}
