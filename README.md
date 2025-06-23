# 3SIM: Blockchain Simulator for Investigating the Blockchain Trilemma

3SIM is a flexible, software-architecture-focused blockchain simulator for investigating the blockchain trilemma. More
information can be found in the [thesis paper](https://gitlab.kit.edu/ucplh/davis-riedel-bachelor-thesis).

## Package Structure

The package is structured as follows:

- `org.palladiosimulator.blockchainsystems.threesim_plugin`: The entry point of the 3SIM Eclipse plugin.
- `org.palladiosimulator.blockchainsystems.threesim`: The business logic for the 3SIM blockchain simulator.
- `org.palladiosimulator.blockchainsystems.plugin`: Common base Eclipse plugin for Palladio-based blockchain simulators.
- `org.palladiosimulator.blockchainsystems.core`: Common logic and abstractions for Palladio-based blockchain
  simulators.
- `org.palladiosimulator.blockchainsystems.bscm`: Ecore-based metamodel for the 3SIM blockchain simulator.
- `org.palladiosimulator.blockchainsystems.loggers`: Loggers to log trace events of the blockchain simulation to
  console, file, or database.

## Pre-requisites

- Eclipse 2025-06 RAP
- Palladio Nightly Plugin
- M2E Plugin (http://download.eclipse.org/technology/m2e/releases/latest/)
- Java 17 or higher
- Maven
- Just

## Building 3SIM

Use `just clean`, `just verify`, and `just build` to clean, verify, and build the 3SIM project. `just` sets required arguments for maven.

## Acknowledgements

3SIM was developed by _Davis Riedel_ as part of his bachelor's thesis at the Karlsruhe Institute of Technology (KIT)
under the supervision of _Prof. Dr. Ralf Reussner_, _Prof. Dr. rer. nat. Robert Heinrich_, and _Dr.-Ing. Niclas
Kannengießer_. 3SIM is based on SM-SIM, which was developed by _Yannik Sproll_.
