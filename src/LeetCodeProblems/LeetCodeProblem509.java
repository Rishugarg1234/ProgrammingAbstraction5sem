package LeetCodeProblems;
// LeetCode Problem 509 = Fibonacci Number
public class LeetCodeProblem509 {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
