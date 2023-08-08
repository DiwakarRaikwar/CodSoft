
    // Account.java
    public class Account {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        // Constructor
        public String accountHolder (){
            return accountHolder;
        }
        public Account(String accountNumber, String accountHolder, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        // Method to deposit money
        public void deposit(double amount) {

            balance += amount;
            System.out.println(balance);
        }

        // Method to withdraw money
        public double withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                return balance; // Withdrawal successful
            } else {
                return balance; // Insufficient funds, withdrawal failed
            }
        }



        // Method to get account balance
        public double getBalance() {
            return balance;
        }
    }

