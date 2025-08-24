#!/usr/bin/env bun

import path from "node:path"
import object from 'lodash/object';

const [sourceFile, key1, metric, key2] = Bun.argv.slice(2);

if (!sourceFile || !key1 || !metric || !key2) {
  console.error("Usage: bun getChartData.ts <source-file> <key1> <metric> <key2>");
  process.exit(1);
}

const sourcePath = path.parse(sourceFile).dir

try {
  console.log()
  const index = await Bun.file(sourceFile).json();
  for (const k of Object.keys(index)) {
    console.log(k)
    const a = index[k]
    for (const v of a) {
      const x = v.value
      const filePath = path.join(sourcePath, v.file)
      const results = await Bun.file(filePath).json()
      const outputMetric = object.get(results, key1).find(m => m.name == metric);
      const y = object.get(outputMetric, key2);

      console.log(`(${x},${y})`)
    }
    console.log()
  }
} catch (error) {
  console.error("Error:", error);
  process.exit(1);
}
