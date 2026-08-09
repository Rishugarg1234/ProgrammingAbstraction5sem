package Basics;
//Q8. Write a Java program that displays grades based on percentage:
//        90+ → A+
//        80–89 → A
//        70–79 → B
//        60–69 → C
//        Below 60 → Fail
import java.util.Scanner;

public class displayGrades {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a>=90){
            System.out.println("Grade: A+");
        }
        else if(a>=80 && a<=89){
            System.out.println("Grade: A");
        }
        else if(a>=70 && a<=79){
            System.out.println("Grade: B");
        }
        else if(a>=60 && a<=69){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
