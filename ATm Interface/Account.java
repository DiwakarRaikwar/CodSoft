
    // Account.java
    public class Account {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        // Constructor
        public Account(String accountNumber, String accountHolder, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        // Method to deposit money
        public void deposit(double amount) {
            balance += amount;
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        // Method to get account balance
        public double getBalance() {
            return balance;
        }
    }

