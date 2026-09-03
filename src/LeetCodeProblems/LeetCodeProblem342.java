package LeetCodeProblems;
// LeetCode Problem 342 = Power of Four
public class LeetCodeProblem342 {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n<=0||n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
