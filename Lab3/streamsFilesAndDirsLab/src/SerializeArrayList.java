import java.io.*;
import java.util.ArrayList;

public class SerializeArrayList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String base = "/Users/macbookair/Downloads/JavaFundamentals/Lab4/04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputFilename = base + "/list.ser";

        String outputFilename = base + "/list.ser";

        java.util.ArrayList<Double> list = new java.util.ArrayList<>(){{
            add(3.14);
            add(10.14);
            add(42.14);
            add(22.14);
        }};

        FileOutputStream fileOutputStream = new FileOutputStream(outputFilename);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(list);

        objectOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream(inputFilename);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        ArrayList<Double> list = (ArrayList<Double>) objectInputStream.readObject();
//
//        for (Double number : list) {
//            System.out.println(number);
//        }
    }
}
