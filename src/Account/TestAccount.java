package Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("123456", "John Doe", 1000.0);
        Account account2 = new Account("789012", "Jane Smith", 2000.0);

        account1.displayInfo();
        account2.displayInfo();

        account1.credit(500.0); // Add 500 to account1
        account2.debit(300.0); // Subtract 300 from account2

        account1.transferTo(account2, 200.0); // Transfer 200 from account1 to account2

        account1.displayInfo();
        account2.displayInfo();


    }
}