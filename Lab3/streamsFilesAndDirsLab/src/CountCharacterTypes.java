import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CountCharacterTypes {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/input.txt";
        String outputFilename = base + "/4output.txt";

        FileInputStream fileInputStream = new FileInputStream(inputFilename);

        PrintWriter printWriter = new PrintWriter(outputFilename);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> punctuation = Arrays.asList('!', '?', ',', '.');
        List<Character> skip = Arrays.asList(' ', '\n');

        int vowelsCount = 0;
        int punctuationCount = 0;
        int consonantsCount = 0;

        int byteData = bufferedReader.read();

        while (byteData >= 0) {

            if (!skip.contains((char)byteData)) {

                if (vowels.contains((char)byteData)) {
                    vowelsCount++;
                    break;
                }

                if (punctuation.contains((char)byteData)) {
                    punctuationCount++;
                    break;
                }

                consonantsCount++;

            }

            byteData = bufferedReader.read();
        }

        printWriter.println("Vowels: " + vowelsCount);
        printWriter.println("Consonants: " + consonantsCount);
        printWriter.println("Punctuation: " + punctuationCount);

        bufferedReader.close();
        printWriter.close();
    }
}
