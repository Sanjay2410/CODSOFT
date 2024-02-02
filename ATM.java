import java.util.Scanner;
public class ATM {
    public ATM(UserBankAccount account){
    }
    public void displayOptions() {
        System.out.println("\nATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose an option (1-4): ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial account balance: $");
        double initialbalance = sc.nextDouble();

        UserBankAccount userAccount = new UserBankAccount(initialbalance);
        ATM atm = new ATM(userAccount);

        int choice;
        do{
            atm.displayOptions();
            choice = sc.nextInt();
            double amount = 0;
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to be deposited: $");
                    amount = sc.nextDouble();
                    userAccount.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to be withdrawn: $");
                    amount = sc.nextDouble();
                    userAccount.wihtdraw(amount);
                    break;
                case 4:
                    System.out.println("Exiting. Thankyou for using the ATM");
                    break;
                default:
                    System.out.println("Please enter valid option.");
            }
        }while(choice != 4);
        sc.close();
    }
}
class UserBankAccount{
    private double balance;

    public UserBankAccount(double initialbalance){
        this.balance = initialbalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit Successful.\nNew Balance: "+ balance);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void wihtdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Successful.\nNew Balance: "+ balance);
            System.out.println("Your Transaction has been successful.");

        }
        else{
            System.out.println("Insufficient Funds...");
        }
    }

}
