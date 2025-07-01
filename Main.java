package BankAccountSimulation;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Print Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    bank.createAccount(scanner);
                    break;
                case 2:
                    bank.deposit(scanner);
                    break;
                case 3:
                    bank.withdraw(scanner);
                    break;
                case 4:
                    bank.checkBalance(scanner);
                    break;
                case 5:
                    bank.printTransactionHistory(scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Thank you for using the Bank App. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

     scanner.close();
    }
}

