// Class with encapsulation
class BankAccount {
    private double balance;

    // Setter method
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the BankAccount class
        BankAccount account = new BankAccount();

        // Using encapsulation to set and get balance
        account.setBalance(1000.50);
        System.out.println("Account Balance: $" + account.getBalance());
    }
}
