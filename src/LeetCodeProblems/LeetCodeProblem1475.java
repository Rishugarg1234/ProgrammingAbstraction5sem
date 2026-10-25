package LeetCodeProblems;
import java.util.*;
// LeetCode Problem 1475 Final Prices With a Special Discount in a Shop
public class LeetCodeProblem1475 {
    class Solution {
        public int[] finalPrices(int[] prices) {
            int n = prices.length;
            int ans[] = Arrays.copyOf(prices,n);
            Stack<Integer>st = new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                    int p= st.pop();
                    ans[p] = prices[p]-prices[i];
                }
                st.push(i);
            }
            return ans;
        }
    }
}
