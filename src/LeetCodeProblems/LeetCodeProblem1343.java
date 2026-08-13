package LeetCodeProblems;
// Approach:
// Use a fixed-size sliding window of size k.
// Calculate the sum of the first window, then slide the window
// by adding the new element and removing the element leaving the window.
// If the average of the current window >= threshold, increment count.

// TC: O(n)
// SC: O(1)
public class LeetCodeProblem1343 {


    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;

        // Calculate sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Check first window
        if (sum / k >= threshold) {
            count++;
        }

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];       // Add new element
            sum -= arr[i - k];   // Remove outgoing element

            if (sum / k >= threshold) {
                count++;
            }
        }

        return count;
    }
}
