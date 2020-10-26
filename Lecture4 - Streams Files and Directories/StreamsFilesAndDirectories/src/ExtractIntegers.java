import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExtractIntegers {

    public static void main(String[] args) throws IOException {

        String basePath = "/Users/macbookair/Downloads/JavaFundamentals/Lecture4/" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources/";

        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "04.ExtractIntegersOutput.txt";

        List<Character> punctuation = Arrays.asList(',', '.', '?', '!');

        Scanner scanner = null;
        FileWriter writer = null;

        try {
            scanner = new Scanner(new FileInputStream(inputPath));
            writer = new FileWriter(outputPath);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.write(String.valueOf(scanner.nextInt()));
                    writer.write('\n');
                }

                scanner.next();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }

            if (writer != null) {
                writer.close();
            }
        }
    }
}
