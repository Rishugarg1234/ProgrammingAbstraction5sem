package Basics;
//Q14. Find the sum of digits of a given number.
//        Example:
//        Input: 456
//        Output: 15
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n = n/10;
        }
        System.out.println(sum);
    }
}
