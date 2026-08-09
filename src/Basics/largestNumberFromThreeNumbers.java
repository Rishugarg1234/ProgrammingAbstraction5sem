package Basics;
//Q5. Write a program to find the largest among three numbers.

import java.util.Scanner;

public class largestNumberFromThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a>=b && a>=c){
            System.out.println("a is the largest");
        }
        else if(b>=a && b>=c){
            System.out.println("b is the largest");
        }
        else{
            System.out.println("c is the largest");
        }
    }
}
