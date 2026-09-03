package LeetCodeProblems;
import java.util.*;
/*
 * LeetCode 39: Combination Sum
 *
 * Given an array of distinct integers and a target value,
 * find all unique combinations where the chosen numbers sum up to the target.
 *
 * A number can be chosen multiple times.
 *
 * Approach:
 * - Use recursion and backtracking.
 * - For each element, we have two choices:
 *   1. Pick the current element (stay at the same index because reuse is allowed).
 *   2. Skip the current element and move to the next index.
 * - When the target becomes 0, add the current combination to the answer.
 *
 * Time Complexity: O(2^N * K) approximately
 * Space Complexity: O(K) for recursion and temporary combination storage
 */

public class LeetCodeProblem39 {
    public void findCombinations(int index, int []candidates, int target, List<List<Integer>>ans,List<Integer>ds){
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            findCombinations(index,candidates,target - candidates[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(index+1,candidates,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
