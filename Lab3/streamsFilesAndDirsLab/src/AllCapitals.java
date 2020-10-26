import java.io.*;

public class AllCapitals {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/input.txt";
        String outputFilename = base + "/3output.txt";

        FileInputStream fileInputStream = new FileInputStream(inputFilename);

        PrintWriter printWriter = new PrintWriter(outputFilename);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        int byteData = bufferedReader.read();

        while (byteData >= 0) {

            if (Character.isLetter(byteData)) {
                byteData = Character.toUpperCase(byteData);
            }

            printWriter.write(byteData);

            byteData = bufferedReader.read();
        }

        bufferedReader.close();
        printWriter.close();
    }
}
