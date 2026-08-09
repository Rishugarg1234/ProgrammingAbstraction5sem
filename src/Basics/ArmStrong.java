package Basics;
//Q22. Check whether a number is an Armstrong Number.

import java.util.Scanner;

public class ArmStrong {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int digitCount = 0;
        while(temp>0){
            digitCount++;
            temp=temp/10;
        }
        int sum = 0;
        temp=n;
        while(temp>0){
            int digit = temp%10;
            sum= sum+(int)Math.pow(digit,digitCount);
            temp = temp/10;

        }
        if(original == sum){
            System.out.println("Its a Armstrong Number");
        }
        else{
            System.out.println("Its not a Armstrong Number");
        }
    }
}
