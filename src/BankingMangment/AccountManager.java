package BankingMangment;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class AccountManager {
    private Map<String , Accounts>accountsMap = new HashMap<>();
    public Accounts createAccount(String accountNumber, double balance,String owner) {
        Accounts account = new Accounts(accountNumber,balance,owner);
        accountsMap.put(accountNumber,account);
        return account;
    }

    public Accounts getAccount(String accountNumber) {
        return accountsMap.get(accountNumber);
    }
    public void deposit(String accountNumber, double amount) {
        Accounts account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }
    public boolean withdraw(String accountNumber, Double amount) {
        Accounts account = getAccount(accountNumber);
        if (account != null) {
            return account.withdraw(amount);
        }
        return false;
    }
    public Double checkBalance(String accountNumber) {
        Accounts account = getAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        }
        return 0.0;
    }
}
