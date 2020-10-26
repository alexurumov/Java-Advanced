import java.io.*;

public class LineNumbers {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/inputLineNumbers.txt";
        String outputFilename = base + "/5output.txt";

        FileInputStream fileInputStream = new FileInputStream(inputFilename);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        PrintWriter printWriter = new PrintWriter(outputFilename);

        String line = bufferedReader.readLine();

        int linesCount = 0;

        while (line != null) {

            linesCount++;
            printWriter.println(linesCount + ". " + line);

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        printWriter.close();

    }
}
