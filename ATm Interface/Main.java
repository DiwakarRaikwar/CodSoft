import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account customer = new Account("235","Diwakar" , 3444);

        Scanner input = new Scanner(System.in);

        System.out.println("hii ! Welcome " + customer.accountHolder());
        while (true) {
            System.out.println("select the number from below banking methods : ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance is : " + customer.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    customer.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount > customer.getBalance()) {
                        System.out.println("Insufficient funds " + "you only have " + customer.getBalance());
                    } else {
                        System.out.println("Transaction success full " + "remaining balance is " + customer.withdraw(withdrawAmount));
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

}
