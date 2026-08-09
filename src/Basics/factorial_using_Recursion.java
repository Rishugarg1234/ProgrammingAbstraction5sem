package Basics;
//Q10. Find the factorial of a number using a loop.
import java.util.Scanner;

public class factorial_using_Recursion {
    static int factorial(int n){
        if(n==1){
            return 1 ;
        }
        return (n*factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial: "+result);

    }
}
