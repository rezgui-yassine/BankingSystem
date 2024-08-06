package BankingMangment;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankingApp {
    private AccountManager accountManager = new AccountManager();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Welcome to the Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the Banking System!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter account owner: ");
        String owner = scanner.next();
        System.out.print("Enter initial balance: ");
        Double initialBalance = scanner.nextDouble();
        accountManager.createAccount(accountNumber, initialBalance, owner);
        System.out.println("Account created successfully!");
    }

    private void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter deposit amount: ");
        Double amount = scanner.nextDouble();
        accountManager.deposit(accountNumber, amount);
        System.out.println("Deposit successful!");
    }

    private void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter withdrawal amount: ");
        Double amount = scanner.nextDouble();
        if (accountManager.withdraw(accountNumber, amount)) {
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    private void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Double balance = accountManager.checkBalance(accountNumber);
        System.out.println("Account Balance: " + balance);
    }
}
