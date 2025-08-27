#!/usr/bin/env bun

import { readdir, mkdir, writeFile } from "node:fs/promises";
import path from "node:path";

const [sourceDir, targetDir, rounds, blocks] = Bun.argv.slice(2);

if (!sourceDir || !targetDir || !rounds || !blocks) {
  console.error("Usage: bun generateLaunchConfigs.ts <source-dir> <target-dir> <rounds> <max-blockchain-length>");
  process.exit(1);
}

try {
  const entries = await readdir(sourceDir, { withFileTypes: true });
  const folders = entries.filter(entry => entry.isDirectory()).map(entry => entry.name);

  await mkdir(targetDir, { recursive: true });

  for (const folder of folders) {
    const folderPath = path.join(sourceDir, folder);
    const files = await readdir(folderPath);
    const blockchainSystemFile = files.find(file => file.endsWith('.blockchainsystem'));
    if (!blockchainSystemFile) continue;

    const fileName = path.parse(blockchainSystemFile).name

    const outPath = path.join(targetDir, `${folder}-${rounds}r-${blocks}b.launch`);

    const absSrcDir = path.resolve(sourceDir);

    const fileContent = `<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<launchConfiguration type="org.palladiosimulator.blockchainsystems.threesim_plugin.PluginLaunchConfigurationType">
    <stringAttribute key="BlockchainSystemModelFilePath" value="platform:/resource/${folder}/${fileName}.blockchainsystem"/>
    <stringAttribute key="DatabaseName" value=""/>
    <stringAttribute key="DatabasePassword" value=""/>
    <stringAttribute key="DatabasePort" value=""/>
    <stringAttribute key="DatabaseServer" value=""/>
    <stringAttribute key="DatabaseUsername" value=""/>
    <stringAttribute key="FailureThroughputThreshold" value="1"/>
    <booleanAttribute key="IsConsoleLoggingEnabled" value="false"/>
    <booleanAttribute key="IsDatabaseLoggingEnabled" value="false"/>
    <booleanAttribute key="IsFileLoggingEnabled" value="false"/>
    <stringAttribute key="LogFilePath" value=""/>
    <stringAttribute key="MaxBlockchainLength" value="${blocks}"/>
    <stringAttribute key="NakamotoCoefficientThreshold" value="50.0"/>
    <stringAttribute key="NumberOfMonteCarloSimulationRounds" value="${rounds}"/>
    <stringAttribute key="ReliabilityObservationTimespan" value="60000"/>
    <stringAttribute key="RequiredNumberOfBlocksInAdvance" value="6"/>
    <stringAttribute key="ShannonEntropyK" value="1.0"/>
    <stringAttribute key="SimulationResultFileDirectory" value="${absSrcDir}/${folder}/results"/>
    <stringAttribute key="SimulationType" value="MonteCarlo"/>
    <stringAttribute key="ThroughputMonitoringInterval" value="60000"/>
    <booleanAttribute key="org.eclipse.debug.core.ATTR_FORCE_SYSTEM_CONSOLE_ENCODING" value="false"/>
</launchConfiguration>
`
    await writeFile(outPath, fileContent);
    console.log(`Created: ${outPath}`);
  }

  console.log(`Created ${folders.length} XML files`);
} catch (error) {
  console.error("Error:", error);
  process.exit(1);
}
