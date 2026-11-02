package LeetCodeProblems;
import java.util.*;
// LeetCode Problem 239 : Sliding Window Maximum;
public class LeetCodeProblem239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int []ans = new int[n-k+1];
            Deque<Integer>dq = new ArrayDeque<>();
            int index=0;
            for(int i=0;i<n;i++){
                if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                    dq.pollFirst();
                }
                while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
                if(i>=k-1){
                    ans[index++] = nums[dq.peekFirst()];
                }

            }
            return ans;


            //Brute Force
            // int list[] = new int[nums.length -k +1];
            // for(int i=0;i<=nums.length-k;i++){
            //     int maxi = nums[i];
            //     for(int j=i;j<i+k;j++){
            //         maxi = Math.max(maxi,nums[j]);
            //     }
            //     list[i]=maxi;
            // }
            // return list;
        }
    }
}
