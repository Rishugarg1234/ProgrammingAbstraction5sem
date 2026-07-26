package Searching;

public class BinarySearch {

    // Binary Search Function
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;   // Corrected
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;

        int ans = binarySearch(arr, target);

        if (ans == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At Index: " + ans);
        }
    }
}