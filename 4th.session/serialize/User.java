package session4.example2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String username;
    private transient String password;  
    private transient String cardNumber;  
    private List<String> accounts; 

  
    public User(String username, String password, String cardNumber) {
        this.username = username;
        this.password = password;
        this.cardNumber = cardNumber;
        this.accounts = new ArrayList<>();
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

public void addAccount(String account) {
        accounts.add(account);  
    }

    public List<String> getAccounts() {
        return accounts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }