package app;

import service.BankService;
import service.impl.BankServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();
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
                case "1" -> openAccount(scanner, bankService);
                case "2" -> deposit(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> statement(scanner);
                case "6" -> listAccounts(scanner);
                case "7" -> searchAccounts(scanner);
                case "8" -> running = false;
            }
        }
    }

    private static void openAccount(Scanner scanner, BankService bankService) {
        System.out.println("Customer Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Customer email: ");
        String email = scanner.nextLine().trim();
        System.out.println("Account Type (SAVING/CURRENT):");
        String type = scanner.nextLine().trim();
        System.out.println("Initial deposit (optional, blank for 0) :");
        String amountStr = scanner.nextLine().trim();
        Double initial =  Double.valueOf(amountStr);
    bankService.openAccount(name,email,type);

    }

    private static void deposit(Scanner scanner) {
    }

    private static void withdraw(Scanner scanner) {
    }

    private static void transfer(Scanner scanner) {
    }

    private static void statement(Scanner scanner) {
    }

    private static void listAccounts(Scanner scanner) {
    }

    private static void searchAccounts(Scanner scanner) {
    }

}
