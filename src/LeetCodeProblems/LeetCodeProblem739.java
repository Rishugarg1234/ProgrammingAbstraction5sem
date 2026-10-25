package LeetCodeProblems;
import java.util.*;
//LeetCode Problem739 : Daily Temperatures
public class LeetCodeProblem739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int ans[] = new int[n];
            Stack<Integer>st = new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                    int prev = st.pop();
                    ans[prev] = i-prev;
                }
                st.push(i);
            }
            // for(int i=0;i<n;i++){
            //     for(int j=i+1;j<n;j++){
            //         if(temperatures[j]>temperatures[i]){
            //             ans[i] = j-i;
            //             break;
            //         }
            //     }
            // } getting time limit exceed
            return ans;
        }
    }
}
