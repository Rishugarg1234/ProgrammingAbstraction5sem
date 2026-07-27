package LeetCodeProblems;
/*
Approach:
- Modified Binary Search
- At every iteration, one half of the array is guaranteed to be sorted.
- Identify the sorted half and check whether the target lies within it.
- Eliminate the other half and continue searching.

Time Complexity: O(log n)
- In every iteration, the search space is reduced by half.

Space Complexity: O(1)
- No extra data structures are used; only a few variables are maintained.

Algorithm:
1. Find the middle element.
2. If it matches the target, return its index.
3. Check whether the left half is sorted.
4. If the target lies in the sorted half, search there.
5. Otherwise, search in the other half.
6. Repeat until the target is found or the search space becomes empty.
*/
public class LeetCodeProblem33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]== target){
                return mid;
            }
            // left half sorted
            if(nums[left]<=nums[mid]){
                if(target<nums[mid] && nums[left]<=target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            // right half sorted
            else{
                if(target>nums[mid] && nums[right]>=target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
