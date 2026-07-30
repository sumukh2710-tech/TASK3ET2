import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance = 0;

    public void deposit(double amount) {

        balance += amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {

            throw new InsufficientFundsException("Insufficient Balance.");

        }

        balance -= amount;

        System.out.println("Withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void showBalance() {

        System.out.println("Available Balance: " + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        int choice;

        do {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();

                    account.deposit(deposit);
                    break;

                case 2:

                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    try {

                        account.withdraw(withdraw);

                    } catch (InsufficientFundsException e) {

                        System.out.println("Exception: " + e.getMessage());

                    }

                    break;

                case 3:

                    account.showBalance();
                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 4);

        sc.close();
    }
}