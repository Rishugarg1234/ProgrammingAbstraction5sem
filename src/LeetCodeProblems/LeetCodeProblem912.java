//LeetCode 912 — Sort an Array

// Approach:
// Using Merge Sort here
// 1. Divide the array into two halves using mid.
// 2. Recursively divide both halves until a single element is left.
// 3. Merge the left and right halves in sorted order.
// 4. Store the merged elements in a temporary array.
// 5. Copy the temporary array back into the original array.

//Time Complexity: O(n log n) — the array is divided into log n levels and merging takes O(n) time at each level.
//Space Complexity: O(n) — a temporary array is used while merging.
package LeetCodeProblems;

public class LeetCodeProblem912 {
    static void mergeSort(int nums[],int low, int high){

        if(low>=high){
            return;
        }
        int mid = low +(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    static void merge(int nums[],int low, int mid, int high){
        int temp[] = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k =0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++] = nums[left++];
            }
            else{
                temp[k++] = nums[right++];
            }
        }
        while(left<=mid){
            temp[k++] = nums[left++];
        }
        while(right<=high){
            temp[k++] = nums[right++];
        }
        for(int i=low;i<=high;i++){
            nums[i] = temp[i-low];
        }
    }
}
