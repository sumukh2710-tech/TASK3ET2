class BankAccount {

    private int balance = 1000;

    public synchronized void deposit(int amount) {

        balance += amount;

        System.out.println(Thread.currentThread().getName()
                + " Deposited: " + amount);

        System.out.println("Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(Thread.currentThread().getName()
                    + " Withdrawn: " + amount);

            System.out.println("Balance: " + balance);

        } else {

            System.out.println("Insufficient Balance");
        }
    }
}

class DepositThread extends Thread {

    BankAccount account;

    DepositThread(BankAccount account) {

        this.account = account;
    }

    public void run() {

        account.deposit(500);
    }
}

class WithdrawThread extends Thread {

    BankAccount account;

    WithdrawThread(BankAccount account) {

        this.account = account;
    }

    public void run() {

        account.withdraw(700);
    }
}

public class ThreadSynchronizationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread d = new DepositThread(account);
        WithdrawThread w = new WithdrawThread(account);

        d.setName("Deposit Thread");
        w.setName("Withdraw Thread");

        d.start();
        w.start();
    }
}