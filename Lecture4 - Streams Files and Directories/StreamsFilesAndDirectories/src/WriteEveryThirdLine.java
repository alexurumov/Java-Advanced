import java.io.*;

public class WriteEveryThirdLine {

    public static void main(String[] args) throws IOException {

        String basePath = "/Users/macbookair/Downloads/JavaFundamentals/Lecture4/" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources/";

        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "05.WriteEveryThirdLineOutput.txt";

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        int row = 1;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputPath));
            printWriter = new PrintWriter(new FileWriter(outputPath));

            String line = bufferedReader.readLine();

            while (line != null) {
                if (row % 3 == 0) {
                    printWriter.println(line);
                }
                row++;

                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }

    }
}
