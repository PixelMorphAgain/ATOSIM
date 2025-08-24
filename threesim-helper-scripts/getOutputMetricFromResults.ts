#!/usr/bin/env bun

import { readdir } from "node:fs/promises";
import path from "node:path";
import object from 'lodash/object';

const [sourceDir, key1, metric, key2] = Bun.argv.slice(2);

if (!sourceDir || !key1 || !metric || !key2) {
  console.error("Usage: bun createListOfOutputMetricResults.ts <source-dir> <key1> <metric> <key2>");
  process.exit(1);
}

try {
  const files = await readdir(sourceDir, { withFileTypes: true });
  const tsrFiles = files.filter(file => file.isFile && file.name.endsWith(".tsr.json"));

  for (const file of tsrFiles) {
    const sourcePath = path.join(file.parentPath, file.name);
    const json = await Bun.file(sourcePath).json();
    const outputMetric = object.get(json, key1).find(m => m.name == metric);
    const val = object.get(outputMetric, key2);

    console.log(`${file.name} ${val}`)
  }
} catch (error) {
  console.error("Error:", error);
  process.exit(1);
}
