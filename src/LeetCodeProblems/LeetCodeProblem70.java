package LeetCodeProblems;
/*
 * Approach:
 * LeetCode Problem 70 Climbing Stairs
 * This problem follows the Fibonacci pattern.
 * To reach step n, we can come from either step n-1 or n-2.
 * So, ways(n) = ways(n-1) + ways(n-2).
 * We use an iterative approach and store only the last two values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LeetCodeProblem70 {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int first = 1;
        int second = 2;
        for(int i=3;i<=n;i++){
            int current = first+second;
            first = second;
            second = current;
        }
        return second;
    }
}
