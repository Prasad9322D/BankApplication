package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to Banking Application");
        while(running) {
            System.out.println("""
                        1) open Account
                        2) Deposit
                        3) Withdraw
                        4) Transfer
                        5) Account Statement
                        6) List Account
                        7) Search Accounts by Customer Name
                        8) Exit
                    """);
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice){
                case "0" -> running = false;
            }
        }
    }
}
