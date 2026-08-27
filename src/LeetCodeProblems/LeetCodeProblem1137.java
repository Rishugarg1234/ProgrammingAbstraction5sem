package LeetCodeProblems;
/*
 * LeetCode Problem 1137 - N-th Tribonacci Number
 *
 * Approach:
 * The Tribonacci sequence follows:
 * T(n) = T(n-1) + T(n-2) + T(n-3)
 *
 * Instead of recursion, we use an iterative approach
 * and store only the last three values.
 *
 * The recursive approach was giving Time Limit Exceeded
 * because it repeatedly calculates the same values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LeetCodeProblem1137 {
    public int tribonacci(int n) {

        if(n == 0){
            return n;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        int first = 0;
        int second = 1;
        int third = 1;

        for(int i = 3; i <= n; i++){

            int current = first + second + third;

            first = second;
            second = third;
            third = current;
        }

        return third;
    }
}
