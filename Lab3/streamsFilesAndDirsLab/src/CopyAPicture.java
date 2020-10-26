import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/The-Virgin-Of-Chancellor-Rolin.jpg";
        String outputFilename = base + "/copy-pictures.jpg";

        FileInputStream inputStream = new FileInputStream(inputFilename);

        byte[] buffer = inputStream.readAllBytes();

        FileOutputStream outputStream = new FileOutputStream(outputFilename);

        outputStream.write(buffer);

        outputStream.close();
    }
}
