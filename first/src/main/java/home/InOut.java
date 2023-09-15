package home;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class InOut {

    /**
     * Reads the contents of a file and returns them as a list of strings.
     *
     * @param filePath the path to the file
     * @return an optional list of strings containing the lines of the file, or an empty optional if the file cannot be read
     */
    public static Optional<List<String>> readFromFile(final String filePath) {
        try {
            final URL fileUrl = Thread.currentThread().getContextClassLoader()
                    .getResource(filePath);
            if (fileUrl == null) {
                return Optional.empty();
            }

            final Path path = Paths.get(fileUrl.toURI());
            return Optional.of(Files.readAllLines(path));

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    /**
     * Writes the provided lines to a file with the given file name in the resources' folder.
     *
     * @param lines    the lines to write to the file
     * @param fileName the name of the file to write to
     */
    public static void writeToFile(@NotNull final List<String> lines, final String fileName) {
        try {
            final File file = new File("src/main/resources/" + fileName);
            final FileWriter writer = new FileWriter(file);

            for (final String line : lines) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }

            writer.close();
            System.out.println("File written successfully: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to write file: " + fileName);
        }
    }
}

