package Account;

public class Account {
    // Private instance variables
    private String id;
    private String name;
    private double balance;

    // Constructor
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Method to credit amount to the account
    public void credit(double amount) {
        balance += amount;
    }

    // Method to debit amount from the account
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to transfer amount to another account
    public void transferTo(Account anotherAccount, double amount) {
        if (amount <= balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    // Method to display account information
    public void displayInfo() {
        System.out.println("Account ID: " + id);
        System.out.println("Account Name: " + name);
        System.out.println("Account Balance: " + balance);
    }
}

