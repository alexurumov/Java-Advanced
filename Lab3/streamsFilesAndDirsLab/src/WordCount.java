import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/words.txt";
        String inputCheckFilename = base + "/text.txt";
        String outputFilename = base + "/6output.txt";

        FileInputStream wordsInputStream = new FileInputStream(inputFilename);

        BufferedReader wordsReader = new BufferedReader(new InputStreamReader(wordsInputStream));

        PrintWriter printWriter = new PrintWriter(outputFilename);

        String line = wordsReader.readLine();

        Map<String, Integer> wordsOccurrences = new HashMap<>();

        while (line != null) {
            String[] wordsArr = line.split("\\s+");
            for (String word : wordsArr) {
                wordsOccurrences.put(word, 0);
            }

            line = wordsReader.readLine();
        }

        FileInputStream textInputStream = new FileInputStream(inputCheckFilename);

        BufferedReader textReader = new BufferedReader(new InputStreamReader(textInputStream));

        String textLine = textReader.readLine();

        while (textLine != null) {

            String[] words = textLine.split("\\s+");
            for (String word : words) {
                if (wordsOccurrences.containsKey(word)) {
                    wordsOccurrences.put(word, wordsOccurrences.get(word) + 1);
                }
            }

            textLine = textReader.readLine();
        }

        wordsOccurrences.entrySet().stream().sorted((es1, es2) -> es2.getValue().compareTo(es1.getValue()))
                .forEach(es -> printWriter.println(es.getKey() + " - " + es.getValue()));

        wordsReader.close();
        textReader.close();
        printWriter.close();
    }
}
