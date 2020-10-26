import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {

    public static void main(String[] args) throws IOException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String firstInputFilename = base + "/text.txt";
        String secondInputFilename = base + "/words.txt";
        String thirdInputFilename = base + "/input.txt";
        String outputFilename = base + "/files.zip";

        FileInputStream fileInputStream = new FileInputStream(firstInputFilename);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilename);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

        zipOutputStream.putNextEntry(new ZipEntry(firstInputFilename));
        zipOutputStream.write(fileInputStream.readAllBytes());

        fileInputStream = new FileInputStream(secondInputFilename);
        zipOutputStream.putNextEntry(new ZipEntry(secondInputFilename));
        zipOutputStream.write(fileInputStream.readAllBytes());

        fileInputStream = new FileInputStream(thirdInputFilename);
        zipOutputStream.putNextEntry(new ZipEntry(thirdInputFilename));
        zipOutputStream.write(fileInputStream.readAllBytes());

        fileInputStream.close();
        zipOutputStream.close();
        fileOutputStream.close();

    }
}
