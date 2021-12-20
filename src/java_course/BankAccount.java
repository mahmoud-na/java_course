package java_course;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this("000.000.0000",1.5,"Default Name","Default Email","Default account Number");
        System.out.println("Empty Constructor called");

    }

    public BankAccount(String phoneNumber, double balance, String customerName, String email, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositFunds) {
        this.balance += depositFunds;
        System.out.println("You Added: " + depositFunds + " $");
    }

    public void withdrawFunds(double withdrawFunds) {
        if ((this.balance - withdrawFunds) >= 0) {
            this.balance -= withdrawFunds;
            System.out.println("You Subtracting: " + withdrawFunds + " $");
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }


    }


}
