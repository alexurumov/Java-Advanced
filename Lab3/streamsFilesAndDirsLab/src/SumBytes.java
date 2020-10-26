import java.io.*;

public class SumBytes {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/input.txt";

        String outputFilename = base + "";

        FileInputStream fileInputStream = new FileInputStream(inputFilename);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String line = bufferedReader.readLine();

        int totalSum = 0;

        while (line != null) {

            int sum = 0;

            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }

            totalSum += sum;

            line = bufferedReader.readLine();
        }

        System.out.println(totalSum);

        fileInputStream.close();
    }
}
