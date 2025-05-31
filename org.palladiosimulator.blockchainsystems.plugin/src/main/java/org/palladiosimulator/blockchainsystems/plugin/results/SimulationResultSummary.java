package org.palladiosimulator.blockchainsystems.plugin.results;

import java.util.Locale;
import java.util.stream.Collectors;

public class SimulationResultSummary {

    private final String _simulationType;

    private final Long _attackerWonRounds;
    private final Long _systemWonRounds;
    private final Long _unambiguousRounds;

    private final Double _attackSuccessProbability;

    public SimulationResultSummary(
            String simulationType,
            Long attackerWonRounds,
            Long systemWonRounds,
            Long unambiguousRounds,
            Double attackSuccessProbability) {
        _simulationType = simulationType;
        _attackerWonRounds = attackerWonRounds;
        _systemWonRounds = systemWonRounds;
        _unambiguousRounds = unambiguousRounds;
        _attackSuccessProbability = attackSuccessProbability;
    }

    public String getSimulationType() {
        return _simulationType;
    }

    // Serialize object to a text file
    public String serializeToText() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimulationType: " + _simulationType);
        sb.append(System.lineSeparator());
        if (getAttackerWonRounds() != null) {
            sb.append("AttackerWonRounds: " + getAttackerWonRounds());
            sb.append(System.lineSeparator());
        }
        if (getSystemWonRounds() != null) {
            sb.append("SystemWonRounds: " + getSystemWonRounds());
            sb.append(System.lineSeparator());
        }
        if (getUnambiguousRounds() != null) {
            sb.append("UnambiguousRounds: " + getUnambiguousRounds());
            sb.append(System.lineSeparator());
        }

        if (getAttackSuccessProbability() != null) {
            sb.append("AttackSuccessProbability: " + String.format(Locale.US, "%.20f", getAttackSuccessProbability()));
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    // Deserialize object from a text file
    public static SimulationResultSummary deserializeFromTextFile(String serializedSummary) {
        String simulationType = null;
        Long attackerWonRounds = null;
        Long systemWonRounds = null;
        Long unambiguousRounds = null;
        Double attackSuccessProbability = null;

        for (String line : serializedSummary.lines().toList()) {
            String[] parts = line.split(": ", 2);
            if (parts.length != 2) {
                continue; // Skip malformed lines
            }

            switch (parts[0]) {
                case "SimulationType":
                    simulationType = parts[1];
                    break;
                case "AttackerWonRounds":
                    attackerWonRounds = Long.parseLong(parts[1]);
                    break;
                case "SystemWonRounds":
                    systemWonRounds = Long.parseLong(parts[1]);
                    break;
                case "UnambiguousRounds":
                    unambiguousRounds = Long.parseLong(parts[1]);
                    break;
                case "AttackSuccessProbability":
                    attackSuccessProbability = Double.parseDouble(parts[1]);
                    break;
            }
        }
        return new SimulationResultSummary(simulationType, attackerWonRounds, systemWonRounds, unambiguousRounds,
                attackSuccessProbability);
    }

    public Long getAttackerWonRounds() {
        return _attackerWonRounds;
    }

    public Long getSystemWonRounds() {
        return _systemWonRounds;
    }

    public Long getUnambiguousRounds() {
        return _unambiguousRounds;
    }

    public Double getAttackSuccessProbability() {
        return _attackSuccessProbability;
    }
}
