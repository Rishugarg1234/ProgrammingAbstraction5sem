package Basics;
// Q2. Write a program to swap two numbers:
//Without using a third variable.
//Using arithmetic operators only.
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Before Swapping: ");
        System.out.print("a="+a+" b="+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("\nAfter Swapping: ");
        System.out.print("a="+a+" b="+b);
    }
}
