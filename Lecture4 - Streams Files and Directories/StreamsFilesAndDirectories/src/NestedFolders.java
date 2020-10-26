import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;

public class NestedFolders {

    public static void main(String[] args) {

        String basePath = "/Users/macbookair/Downloads/JavaFundamentals/Lecture4/" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources/";

        String inputFileName = basePath + "Files-and-Streams";

        File folderToRead = new File(inputFileName);

        int folderCount = 0;

        ArrayDeque<File> filesToTraverse = new ArrayDeque<>(Arrays.asList(folderToRead));

        while (!filesToTraverse.isEmpty()) {

            File currentFile = filesToTraverse.poll();

            if (currentFile.isDirectory()) {
                folderCount++;

                filesToTraverse.addAll(Arrays.asList(currentFile.listFiles()));

                System.out.println(currentFile.getName());

            }
        }

        System.out.println(folderCount + " folders");
    }
}
