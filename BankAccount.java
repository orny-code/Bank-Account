package OOP;

public class BankAccount {
    String name;
    String accountNumber;
    double balance;

    BankAccount(String n, String accNum, double initialBalance) {
        name = n;
        accountNumber = accNum;
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ormy","Acc12345", 1000.0);

        acc1.displayInfo();
        acc1.deposit(500);
        acc1.withdraw(20000);

        System.out.println(" ");
        acc1.displayInfo();
    }

}
