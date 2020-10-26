import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleTextEditor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String text = "";

        ArrayDeque<String> history = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] cmd = in.nextLine().split("\\s+");
            int operation = Integer.parseInt(cmd[0]);
            switch (operation) {
                case 1:
                    String append = cmd[1];
                    history.push(text);
                    text += append;
                    break;
                case 2:
                    int eraseCount = Integer.parseInt(cmd[1]);
                    history.push(text);
                    text = text.substring(0, text.length() - eraseCount);
                    break;
                case 3:
                    int index = Integer.parseInt(cmd[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case 4:
                    text = history.pop();
                    break;
                default:
                    break;
            }
        }
    }
}
