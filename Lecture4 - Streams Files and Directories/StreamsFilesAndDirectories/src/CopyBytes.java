import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CopyBytes {

    public static void main(String[] args) throws IOException {

        String basePath = "/Users/macbookair/Downloads/JavaFundamentals/Lecture4/" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources/";

        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "03.CopyBytesOutput.txt";


        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputPath);
            outputStream = new FileOutputStream(outputPath);

            int byteData = inputStream.read();

            while (byteData >= 0) {
                if (byteData == ' ' || byteData == '\n') {
                    outputStream.write(byteData);
                } else {
                    String number = String.valueOf(byteData);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }
                }

                byteData = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
