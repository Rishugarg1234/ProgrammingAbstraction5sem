package Basics;
//Q3. Write a program to check whether a number is:
//        Even or Odd
//        Positive, Negative, or Zero
import java.util.Scanner;

public class checkEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // Even or Odd
        if(a%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }

        // Positive,Negative, or Zero
        if(a>0){
            System.out.println("The number is Positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is Zero");
        }

    }
}
