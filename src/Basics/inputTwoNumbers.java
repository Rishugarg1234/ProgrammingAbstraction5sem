package Basics;
//Q1. Write a Java program to input two numbers and print:
//        Sum
//        Difference
//        Product
//        Quotient
//        Remainder
import java.util.*;
public class inputTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Product: "+(a*b));
        System.out.println("Quotient: "+(a/b));
        System.out.println("Remainder: "+(a%b));
    }

}
