package LeetCodeProblems;
import java.util.*;
//LeetCode problem 11 Container with most Water
public class LeetCodeProblem11 {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length-1;
            int maxArea=0;
            while(left<right){
                int h = Math.min(height[left],height[right])*(right-left);
                maxArea = Math.max(maxArea,h);


                if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }

            }
            return maxArea;
        }
    }
}
