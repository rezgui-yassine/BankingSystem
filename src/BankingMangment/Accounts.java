package BankingMangment;

import Interface.DepositAndWithred;

public class Accounts implements DepositAndWithred {
    private String accountNumber;
    private double balance;

    public Accounts() {};
    public Accounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public void deposit(double amount) {
        if(amount <=0){
            System.out.println("You can't deposit negative amount");
        }else {
            balance += amount;
        }
    };
    @Override
    public void withdraw(double amount) {
        if(amount <=0){
            System.out.println("you can't withdraw amount <= 0");
        }
    };
}
