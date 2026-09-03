package LeetCodeProblems;
import java.util.*;
/*
 * LeetCode 40: Combination Sum II
 *
 * Given a collection of candidate numbers (which may contain duplicates)
 * and a target number, find all unique combinations where the chosen
 * numbers sum up to the target.
 *
 * Each number can be used only once in a combination.
 *
 * Approach:
 * - Sort the array to handle duplicates efficiently.
 * - Use recursion and backtracking to generate combinations.
 * - Skip duplicate elements at the same recursion level to avoid
 *   duplicate combinations.
 * - Move to index (i + 1) after picking an element because each
 *   element can be used only once.
 * - If the current element exceeds the target, stop exploring further
 *   because the array is sorted.
 *
 * Time Complexity: O(2^N * K) approximately
 * Space Complexity: O(K) for recursion stack and temporary combination.
 */
public class LeetCodeProblem40 {
    public void findCombinations(int index, int[]candidates, int target, List<List<Integer>>ans, List<Integer>ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            ds.add(candidates[i]);
            findCombinations(i+1,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
