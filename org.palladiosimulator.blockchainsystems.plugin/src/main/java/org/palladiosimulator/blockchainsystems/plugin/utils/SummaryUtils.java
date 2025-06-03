package org.palladiosimulator.blockchainsystems.plugin.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary;
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes;

/**
 * Utility class for saving simulation result summaries.
 *
 * @author Yannik Sproll, Davis Riedel
 */
public final class SummaryUtils {
    private SummaryUtils() {
    }

    public static void saveResultSummary(
            SimulationResultSummary summary,
            ILaunchConfiguration configuration
    ) throws CoreException {
        String path = configuration.getAttribute(
                Attributes.ArchitecturalModels.SIMULATION_RESULT_FILE_DIRECTORY,
                Attributes.ArchitecturalModels.SIMULATION_RESULT_FILE_DIRECTORY_DEFAULT
        );

        String fileName = getCurrentTimeFormatted() + "-" + summary.getSimulationType() + ".dssimresult";
        String fullFilePath = Path.of(path, fileName).toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullFilePath))) {
            writer.write(summary.serializeToText());
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file " + fullFilePath + ".");
            e.printStackTrace();
        }
    }

    private static String getCurrentTimeFormatted() {
        Instant now = Instant.now();

        // Convert Instant to ZonedDateTime in the system default time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");

        // Format the ZonedDateTime
        return zonedDateTime.format(formatter);
    }
}
