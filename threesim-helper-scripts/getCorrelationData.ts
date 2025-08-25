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
  let i = 0;
  for (const v of a) {
    const x = v.value
    const filePath = path.join(sourcePath, v.file)
    const results = await Bun.file(filePath).json()
    const outputMetrics = object.get(results, "averageSimulationRoundResult")

    if (i === 0) {
      const headers = outputMetrics.map(m => m.name).join(",");
      console.log(`${name},${headers}`);
    }
    i++

    let outputStr = `${x}`
    for (const m of outputMetrics) {
      if (m.name === "FaultTolerance") {
        const y1 = object.get(m, "average.throughputDelta.average")
        const y2 = object.get(m, "average.confirmationLatencyDelta.average")
        outputStr += `,(${y1};${y2})`
        continue
      }
      const y = object.get(m, "average");
      outputStr += `,${y}`
    }
    console.log(outputStr)
  }
  console.log()
} catch (error) {
  console.error("Error:", error);
  process.exit(1);
}
