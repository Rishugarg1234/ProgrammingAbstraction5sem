package Basics;
//Q19. Division Calculator
//Write a Java program that takes two integers and performs division.
//Handle:
//ArithmeticException
//InputMismatchException
//Display meaningful error messages.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (InputMismatchException e){
            System.out.println("Error: Please enter integers only.");
        }
    }
}
