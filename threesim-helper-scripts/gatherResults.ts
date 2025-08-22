#!/usr/bin/env bun

import { readdir, mkdir, copyFile } from "node:fs/promises";
import path from "node:path";

const [sourceDir, targetDir] = Bun.argv.slice(2);

if (!sourceDir || !targetDir) {
  console.error("Usage: bun gatherResults.ts <source-dir> <target-dir>");
  process.exit(1);
}

try {
  const entries = await readdir(sourceDir, { withFileTypes: true });
  const folders = entries.filter(entry => entry.isDirectory()).map(entry => entry.name);

  await mkdir(targetDir, { recursive: true });

  for (const folder of folders) {
    const folderPath = path.join(sourceDir, folder, "results");
    try {
      const files = await readdir(folderPath);
      const tsrFiles = files.filter(file => file.endsWith(".tsr.json"));

      for (const file of tsrFiles) {
        const sourcePath = path.join(folderPath, file);
        const targetPath = path.join(targetDir, `${folder}_${file}`);
        await copyFile(sourcePath, targetPath);
      }
    } catch (_) {
      continue
    }
  }

  console.log(`Copied result files to ${targetDir}`)
} catch (error) {
  console.error("Error:", error);
  process.exit(1);
}
