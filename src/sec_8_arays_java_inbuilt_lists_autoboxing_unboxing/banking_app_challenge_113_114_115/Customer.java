package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.banking_app_challenge_113_114_115;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double transaction) {
        this.name = name;
        setTransactions(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(double transactions) {
        this.transactions.add(transactions);
    }
}
