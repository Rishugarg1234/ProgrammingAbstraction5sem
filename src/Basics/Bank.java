package Basics;
//Q16. Bank Account
//Create a BankAccount class having:
//accountNumber
//        accountHolderName
//balance
//Methods:
//deposit()
//withdraw()
//checkBalance()
//Do not allow withdrawal if balance is insufficient.
class BankAccount{
    public int accountNumber;
    public String accountHolderName;
    public int Balance;

    BankAccount(int accountNumber, String accountHolderName,int Balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.Balance = Balance;
    }
    public void deposit(int amount){
        Balance+=amount;
        System.out.println("Amount deposited: " + amount);
    }
    public void withdraw(int amount){
        if(amount>Balance){
            System.out.println("Withdrawl if not sufficient");
        }
        else{
            Balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
        }

    }
    public int checkBalance(){
        return Balance;
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101,"XYZ",5000);
        b1.deposit(3000);
        b1.withdraw(2000);
        System.out.println("Current Balance: "+b1.checkBalance());

    }
}
