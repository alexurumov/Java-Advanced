import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        printReversedArray(arr, arr.length - 1);
    }

    private static void printReversedArray(int[] arr, int index) {

        if (index < 0) {
            return;
        }

        System.out.print(arr[index] + " ");
        printReversedArray(arr, index - 1);
    }
}
