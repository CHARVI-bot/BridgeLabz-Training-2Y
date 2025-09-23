public class BankAccount {
    private static String bankName = "BridgeLabz Bank";

    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; 
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name         : " + bankName);
            System.out.println("Account Holder    : " + accountHolderName);
            System.out.println("Account Number    : " + accountNumber);
            System.out.println("Current Balance   : ₹" + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Charvi Sharma", 1001, 50000.0);
        BankAccount acc2 = new BankAccount("Aarav Mehta", 1002, 75000.0);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}