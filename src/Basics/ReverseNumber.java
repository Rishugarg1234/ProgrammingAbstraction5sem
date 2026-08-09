package Basics;
//Q11. Reverse a given number.
//        Example:
//        Input: 12345
//        Output: 54321
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;

        }
        System.out.println("Reverse of Number: "+ rev);
    }
}
