import java.io.File;

public class ListFiles {

    public static void main(String[] args) {

        String basePath = "/Users/macbookair/Downloads/JavaFundamentals/Lecture4/" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources/";

        String inputFileName = basePath + "Files-and-Streams";

        File folderToRead = new File(inputFileName);

        File[] files = folderToRead.listFiles();

        for (File file : files) {
            if (!file.isDirectory()) {
                System.out.printf("%s: [%d]\n", file.getName(), file.length());
            }
        }
    }
}
