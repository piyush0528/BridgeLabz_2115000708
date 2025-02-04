public class bankaccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;

    public bankaccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
public static int getTotalAccounts() {
return totalAccounts;
}
public void displayAccountDetails() {
if (this instanceof bankaccount) {
System.out.println("Bank Name: " + bankName);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Account Number: " + accountNumber);
} else {
System.out.println("This is not a valid BankAccount object.");
}
}

public static void main(String[] args) {
bankaccount account1 = new bankaccount("Alice", 1001);
bankaccount account2 = new bankaccount("Bob", 1002);

account1.displayAccountDetails();
account2.displayAccountDetails();

System.out.println("Total Accounts: " + bankaccount.getTotalAccounts());
}
}
