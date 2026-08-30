package LeetCodeProblems;
// Approach: Binary Exponentiation (Exponentiation by Squaring)
// Instead of multiplying x, n times, we recursively divide the exponent by 2.
// If n is even: x^n = (x^(n/2))^2
// If n is odd:  x^n = x * (x^(n/2))^2
//
// Time Complexity: O(log n)
// Space Complexity: O(log n) due to recursive call stack

public class LeetCodeProblem50 {
    public double myPow(double x, int n) {
        long N = n;
        if(N==0){
            return 1;
        }
        if(N<0){
            return 1/Math.pow(x,-N);
        }
        double half = myPow(x,(int)N/2);
        if(N%2 == 0){
            return half*half;
        }
        else{
            return x*half*half;
        }
    }
}
