package LeetCodeProblems;
//LeetCode Problem 1979 : Find the Greatest Common Divisior of the Array
public class LeetCodeProblem1979 {
    class Solution {
        public int findGCD(int[] nums) {
            int max=nums[0];
            int min= nums[0];
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
                if(nums[i]<min){
                    min=nums[i];
                }
            }
            return GCD(max,min);
        }
        public int GCD(int max,int min){
            if(min==0){
                return max;
            }
            return GCD(min,max%min);
        }
    }
}
