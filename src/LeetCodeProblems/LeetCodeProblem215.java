package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 215 : Find Kth Largest Element in an Array
public class LeetCodeProblem215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            // Brute Force
            // Arrays.sort(nums);
            // return nums[nums.length-k];
            PriorityQueue<Integer>pq = new PriorityQueue<>();
            for(int i=0;i<nums.length;i++){
                pq.add(nums[i]);
                if(pq.size()>k){
                    pq.poll();
                }
            }
            return pq.peek();
        }
    }
}
