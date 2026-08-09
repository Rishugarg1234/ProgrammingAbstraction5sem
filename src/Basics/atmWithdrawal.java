package Basics;

//Q20. ATM Withdrawal (Custom Exception)
//Create a custom exception named:
//InsufficientBalanceException
//Create an ATM class that:
//Maintains account balance.
//Allows withdrawal only if sufficient balance is available.
//Throws the custom exception when the balance is insufficient.

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class ATM{
    double balance;
    ATM(double balance){
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException(
                    "Insufficient balance! Available balance: "+balance
            );
        }
        balance = balance-amount;
        System.out.println("Withdrawal successfull");
        System.out.println("Remaining balance: "+balance);
    }
}
public class atmWithdrawal {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ATM atm = new ATM(10000);
       System.out.println("Amount to be withdrawn: ");
       double amount = sc.nextDouble();

       try{
           atm.withdraw(amount);
       }
       catch (InsufficientBalanceException e){
           System.out.println("Error: "+e.getMessage());
       }
    }

}
