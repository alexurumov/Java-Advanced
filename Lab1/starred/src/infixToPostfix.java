import java.util.*;

public class infixToPostfix {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] tokens = in.nextLine().split(" ");

        ArrayDeque<String> operators = new ArrayDeque<>();

        List<String> output = new ArrayList<>();

        for (int i = 0; i < tokens.length; i++) {

            if (Character.isDigit(tokens[i].charAt(0)) ||
                    Character.isAlphabetic((tokens[i].charAt(0)))) {
                output.add(tokens[i]);
            } else if (tokens[i].charAt(0) == '+' ||
                    tokens[i].charAt(0) == '-' ||
                    tokens[i].charAt(0) == '*' ||
                    tokens[i].charAt(0) == '/'){

                boolean needToPop = false;

                if (!operators.isEmpty()) {
                    if (operators.peek().equals("*") || operators.peek().equals("/")) {
                        needToPop = true;
                    } else {
                        if (tokens[i].equals("+") || tokens[i].equals("-")) {
                            needToPop = true;
                        }
                    }
                }

                if (needToPop && !operators.peek().equals("(")) {
                    output.add(operators.pop());
                }
                operators.push(tokens[i]);

            } else if (tokens[i].charAt(0) == '('){
                operators.push(tokens[i]);
            } else {
                while (!operators.peek().equals("(")) {
                    output.add(operators.pop());
                }
                operators.pop();
            }
        }

        while (!operators.isEmpty()) {
            output.add(operators.pop());
        }

        for (String token:output) {
            System.out.print(token + " ");
        }

    }
}
