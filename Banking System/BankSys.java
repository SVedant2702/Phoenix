import java.util.*;

// Interface (Abstraction)
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void displayDetails();
}

// Abstract class
abstract class BankAccount implements BankOperations {
    private String accountNumber;   // Encapsulation
    private String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public abstract void withdraw(double amount); // abstract method

    @Override
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber +
        " | Holder: " + accountHolder +" | Balance: " + balance);
    }
}

// Savings Account (Inheritance + Polymorphism)
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining: " + balance);
        } else {
            System.out.println("Withdrawal failed! Maintain minimum balance of " + MIN_BALANCE);
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 1000;

    public CurrentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining: " + balance);
        } else {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        }
    }
}

// Main Banking System
public class BankSys {
    private static List<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BANKING MENU ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createSa(sc);
                case 2 -> createCa(sc);
                case 3 -> doDeposit(sc);
                case 4 -> doWithdraw(sc);
                case 5 -> displayAllAccounts();
                case 6 -> {
                    System.out.println("Exiting System...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void createSa(Scanner sc) {
        System.out.print("Enter Account No: ");
        String accNo = sc.next();
        System.out.print("Enter Holder Name: ");
        String name = sc.next();
        System.out.print("Enter Opening Balance: ");
        double bal = sc.nextDouble();

        accounts.add(new SavingsAccount(accNo, name, bal));
        System.out.println("✅ Savings Account created!");
    }

    public static void createCa(Scanner sc) {
        System.out.print("Enter Account No: ");
        String accNo = sc.next();
        System.out.print("Enter Holder Name: ");
        String name = sc.next();
        System.out.print("Enter Opening Balance: ");
        double bal = sc.nextDouble();

        accounts.add(new CurrentAccount(accNo, name, bal));
        System.out.println("✅ Current Account created!");
    }

    public static void doDeposit(Scanner sc) {
        System.out.print("Enter Account No: ");
        String accNo = sc.next();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount to Deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        }
    }

    public static void doWithdraw(Scanner sc) {
        System.out.print("Enter Account No: ");
        String accNo = sc.next();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount to Withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        }
    }

    public static void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
        } else {
            System.out.println("\n--- Account Details ---");
            for (BankAccount acc : accounts) {
                acc.displayDetails();
            }
        }
    }

    private static BankAccount findAccount(String accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
