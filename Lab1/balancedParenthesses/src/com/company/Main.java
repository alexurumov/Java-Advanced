package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String parentheses = in.nextLine();

        ArrayDeque<Character> leftPar = new ArrayDeque<>();

        boolean isBalanced = true;

        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '{' || parentheses.charAt(i) == '[' || parentheses.charAt(i) == '(') {
                leftPar.push(parentheses.charAt(i));
            } else {
                char currentPar = parentheses.charAt(i);
                if (leftPar.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                switch (leftPar.pop()) {
                    case '{':
                        if (currentPar != '}') {
                            isBalanced = false;
                        }
                        break;
                    case '[':
                        if (currentPar != ']') {
                            isBalanced = false;
                        }
                        break;
                    case '(':
                        if (currentPar != ')') {
                            isBalanced = false;
                        }
                        break;
                    default:
                        break;
                }

                if (!isBalanced) {
                    break;
                }
            }

        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
