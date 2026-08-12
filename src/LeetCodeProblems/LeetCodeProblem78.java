package LeetCodeProblems;

import java.util.*;

// TC: O(2^n * n)
// SC: O(n) auxiliary space + O(2^n * n) for storing the answer

// Approach:
// Use recursion and backtracking.
// For every element, we have two choices:
// 1. Include the element
// 2. Exclude the element
// This creates a binary recursion tree with 2^n possible subsets.

public class LeetCodeProblem78 {

    List<List<Integer>> ans = new ArrayList<>();

    void solve(int nums[], int index, List<Integer> current) {

        // Base case: all elements have been processed
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Include the current element
        current.add(nums[index]);
        solve(nums, index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);

        // Choice 2: Exclude the current element
        solve(nums, index + 1, current);
    }

    public List<List<Integer>> subsets(int[] nums) {
        solve(nums, 0, new ArrayList<>());
        return ans;
    }
}