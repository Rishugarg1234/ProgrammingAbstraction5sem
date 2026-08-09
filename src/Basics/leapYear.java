package Basics;
//Q7. Write a program to check whether a year is a Leap Year.
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400 == 0 || (year%4==0 && year%100!=0)){
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }

    }
}
