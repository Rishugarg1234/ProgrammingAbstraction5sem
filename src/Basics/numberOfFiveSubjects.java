package Basics;
//Q4. Write a program that takes marks of 5 subjects and calculates:
//        Total Marks
//        Percentage
//        Average

import java.util.Scanner;

public class numberOfFiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        double TotalMarks = a+b+c+d+e;
        double percentage = ((TotalMarks)/500.0)*100;
        double average = (TotalMarks)/5;

        System.out.println("Total Marks: "+TotalMarks);
        System.out.println("Percentage: "+percentage);
        System.out.println("average: "+average);
    }

}
