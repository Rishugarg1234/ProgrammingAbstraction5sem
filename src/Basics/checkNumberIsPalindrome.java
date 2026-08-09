package Basics;

//Q12. Check whether a number is a Palindrome.
//        Example:
//        121 → Palindrome
//        123 → Not Palindrome
import java.util.Scanner;

public class checkNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if(original == rev){
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("This Number is not Palindrome");
        }
    }
}
