import java.util.List;
import java.util.Optional;

import static home.InOut.readFromFile;
import static home.InOut.writeToFile;

public class Main {
    private static final String FILE_IN = "in.txt";
    private static final String FILE_OUT = "out.txt";

    public static void main(String[] args) {
        final Optional<List<String>> linesOptional = readFromFile(FILE_IN);
        if (linesOptional.isPresent()) {
            final List<String> lines = linesOptional.get();
            writeToFile(lines, FILE_OUT);
        }
    }
}
