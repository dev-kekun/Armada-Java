import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;
    private static final double INTEREST_RATE = 0.05;

    public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit must be non-negative.");
        }
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Initial Deposit: $" + initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || !accountNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Account number must be exactly 10 digits.");
        }
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be null or empty.");
        }
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
        balance += amount;
        transactionHistory.add("Deposit: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: $" + amount);
    }

    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        transactionHistory.add("Interest Applied: $" + interest);
    }

    public void viewTransactionHistory() {
        System.out.println("--- Transaction History ---");
        for (String transaction : transactionHistory) {
            System.out.println("- " + transaction);
        }
    }

    public void viewAccountDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class SecureBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nWelcome to the Secure Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number (10 digits): ");
                        String accountNumber = scanner.nextLine();
                        System.out.print("Enter Account Holder Name: ");
                        String accountHolder = scanner.nextLine();
                        System.out.print("Enter Initial Deposit: ");
                        double initialDeposit = scanner.nextDouble();
                        account = new BankAccount(accountNumber, accountHolder, initialDeposit);
                        System.out.println("Account created successfully!");
                        break;
                    case 2:
                        if (account == null) {
                            System.out.println("No account found. Please create an account first.");
                        } else {
                            account.viewAccountDetails();
                        }
                        break;
                    case 3:
                        if (account == null) {
                            System.out.println("No account found. Please create an account first.");
                        } else {
                            System.out.print("Enter deposit amount: ");
                            double depositAmount = scanner.nextDouble();
                            account.deposit(depositAmount);
                            System.out.println("Deposit successful. New Balance: $" + account.getBalance());
                        }
                        break;
                    case 4:
                        if (account == null) {
                            System.out.println("No account found. Please create an account first.");
                        } else {
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawalAmount = scanner.nextDouble();
                            account.withdraw(withdrawalAmount);
                            System.out.println("Withdrawal successful. New Balance: $" + account.getBalance());
                        }
                        break;
                    case 5:
                        if (account == null) {
                            System.out.println("No account found. Please create an account first.");
                        } else {
                            account.applyInterest();
                            System.out.println("Interest applied. New Balance: $" + account.getBalance());
                        }
                        break;
                    case 6:
                        if (account == null) {
                            System.out.println("No account found. Please create an account first.");
                        } else {
                            account.viewTransactionHistory();
                        }
                        break;
                    case 7:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
