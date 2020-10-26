import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoFiles {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputOneFilename = base + "/inputOne.txt";
        String inputTwoFilename = base + "/inputTwo.txt";
        String outputFilename = base + "/7output.txt";

        Path pathFirst = Paths.get(inputOneFilename);
        Path pathSecond = Paths.get(inputTwoFilename);

        Path outputPath = Paths.get(outputFilename);

        List<String> linesFirst = Files.readAllLines(pathFirst);

        List<String> linesSecond = Files.readAllLines(pathSecond);

        List<String> concatLines = new ArrayList<>();

        concatLines.addAll(linesFirst);
        concatLines.addAll(linesSecond);

        Files.write(outputPath, concatLines);

    }
}
