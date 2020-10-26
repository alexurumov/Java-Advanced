import java.io.File;
import java.util.Arrays;

public class GetFolderSize {

    public static void main(String[] args) {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/Exercises Resources";

        File folderToRead = new File(inputFilename);

        long sum = Arrays.stream(folderToRead.listFiles()).filter(e -> e.isFile()).mapToLong(e -> e.length()).sum();

        System.out.println("Folder size: " + sum);
    }
}
