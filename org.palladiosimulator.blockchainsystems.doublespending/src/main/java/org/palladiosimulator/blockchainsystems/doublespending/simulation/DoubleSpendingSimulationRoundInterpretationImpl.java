package org.palladiosimulator.blockchainsystems.doublespending.simulation;

public class DoubleSpendingSimulationRoundInterpretationImpl implements SimulationRoundInterpretation {

    public InterpretedResult interpretRoundResult(SimulationRoundResult roundResult) {

        if (areVotesUnambiguous(roundResult)) {
            return InterpretedResult.Unambiguous;
        }

        if (roundResult.getNumberOfAttackerWonVotes() > 0) {
            return InterpretedResult.AttackerWon;
        }

        if (roundResult.getNumberOfSystemWonVotes() > 0) {
            return InterpretedResult.SystemWon;
        }

        // TODO: Check and implement if necessary
		/*if (roundResult.getNumberOfBTONotIncludedVotes() > 0) {
			
		}*/

        return InterpretedResult.Unambiguous;
    }

    private static boolean areVotesUnambiguous(SimulationRoundResult roundResult) {
        int numberOfVoteTypesGreaterThanZero = 0;

        if (roundResult.getNumberOfAttackerWonVotes() > 0) {
            numberOfVoteTypesGreaterThanZero++;
        }

        if (roundResult.getNumberOfBTONotIncludedVotes() > 0) {
            numberOfVoteTypesGreaterThanZero++;
        }

        if (roundResult.getNumberOfSystemWonVotes() > 0) {
            numberOfVoteTypesGreaterThanZero++;
        }

        return numberOfVoteTypesGreaterThanZero != 1;
    }
}
