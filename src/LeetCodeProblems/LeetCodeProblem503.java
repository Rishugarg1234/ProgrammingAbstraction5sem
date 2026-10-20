package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 503 Next Greator Element II
public class LeetCodeProblem503 {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            // brute force
            // int nge[] = new int[nums.length];
            // for(int i=0;i<nums.length;i++){
            //     nge[i]=-1;
            //     for(int j=i+1;j<i+nums.length;j++){
            //         int idx = j%nums.length;
            //         if(nums[idx]>nums[i]){
            //             nge[i] = nums[idx];
            //             break;
            //         }
            //     }
            // }
            // return nge;

            int nge[] = new int[nums.length];
            Stack<Integer>st = new Stack<>();
            for(int i=2*nums.length-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                    st.pop();
                }
                if(i<nums.length){
                    if(st.isEmpty()){
                        nge[i]=-1;
                    }
                    else{
                        nge[i]=st.peek();
                    }
                }
                st.push(nums[i%nums.length]);
            }
            return nge;
        }
    }
}
