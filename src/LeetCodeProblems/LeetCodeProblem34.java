package LeetCodeProblems;
/*
Question Find First and Last Position of Element in Sorted Array
Approach:
1. Perform Binary Search twice.
2. First search finds the leftmost (first) occurrence.
3. Second search finds the rightmost (last) occurrence.
4. Return both indices as an array.

Time Complexity:
- firstPos()  : O(log n)
- lastPos()   : O(log n)
- Overall     : O(log n)

Space Complexity:
- O(1) (Constant extra space)
*/

public class LeetCodeProblem34 {
    public static int firstPos(int []nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]== target){
                ans = mid;
                right = mid-1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static int lastPos(int []nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]== target){
                ans = mid;
                left = mid+1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstPos(nums, target);
        int last = lastPos(nums,target);
        int ans[] = {first,last};
        return ans;
    }
}
