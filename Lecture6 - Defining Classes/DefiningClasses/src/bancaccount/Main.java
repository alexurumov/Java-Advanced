package bancaccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] lineArguments = in.nextLine().split(" ");
        String command = lineArguments[0];

        Map<Integer, BankAccount> accounts = new HashMap<>();

        while (!command.equals("End")) {

            String result = "";

            switch (command) {

                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);

                    result = String.format("Account ID%d created%n", account.getId());
                    break;
                case "Deposit":
                    int accountID = Integer.parseInt(lineArguments[1]);
                    double amount = Double.parseDouble(lineArguments[2]);

                    BankAccount currentAccount = accounts.get(accountID);

                    if (currentAccount == null) {
                        result = String.format("Account does not exist%n");
                        break;
                    }

                    currentAccount.deposit(amount);
                    accounts.put(accountID, currentAccount);

                    result = String.format("Deposited %s to ID%d%n", lineArguments[2], accountID);

                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(lineArguments[1]);
                    BankAccount.setInterestRate(newInterest);

                    break;
                case "GetInterest":
                    int accountId2 = Integer.parseInt(lineArguments[1]);
                    int years = Integer.parseInt(lineArguments[2]);

                    BankAccount currentAccount2 = accounts.get(accountId2);

                    if (currentAccount2 == null) {
                        result = String.format("Account does not exist%n");
                        break;
                    }

                    double interest = currentAccount2.getInterest(years);

                    result = String.format("%.2f%n", interest);
                    break;
            }

            System.out.print(result);

            lineArguments = in.nextLine().split(" ");
            command = lineArguments[0];
        }
    }
}
