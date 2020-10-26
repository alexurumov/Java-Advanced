import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {

    public static void main(String[] args) {

        String basePath = "/Users/macbookair/Downloads/JavaFundamentals/Lecture4/" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources/";

        String inputFileName = basePath + "6input.txt";
        String outputFileName = basePath + "06.SortLinesOutput.txt";

        Path inputPath = Paths.get(inputFileName);
        Path outputPath = Paths.get(outputFileName);

        try {
            List<String> lines = Files.readAllLines(inputPath);

            Collections.sort(lines);

            Files.write(outputPath, lines);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
