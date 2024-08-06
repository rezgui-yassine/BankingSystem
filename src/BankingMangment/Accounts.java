package BankingMangment;

import Interface.DepositAndWithred;

public class Accounts implements DepositAndWithred {
    private String accountNumber;
    private double balance;
    private  String owner;

    public Accounts() {};
    public Accounts(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = accountNumber;
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
    public boolean withdraw(double amount) {
        if(amount <=0){
            System.out.println("you can't withdraw amount <= 0");
        }
        return false;
    };


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

