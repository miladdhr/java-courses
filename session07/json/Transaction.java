package ir.freeland.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

    @JsonProperty("fromAccount") 
    private String fromAccount;

    @JsonProperty("toAccount")
    private String toAccount;

    @JsonProperty("amount") 
    private double amount;

    @JsonProperty("description") 
    private String description;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "fromAccount='" + fromAccount + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
