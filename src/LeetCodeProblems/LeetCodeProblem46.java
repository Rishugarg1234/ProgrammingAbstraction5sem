package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 46 Permutations
public class LeetCodeProblem46 {
    class Solution {
        public void permutation(int []nums,List<List<Integer>>ans,List<Integer>ds){
            if(ds.size()==nums.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(ds.contains(nums[i])){
                    continue;
                }
                ds.add(nums[i]);
                permutation(nums,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
            Arrays.sort(nums);
            permutation(nums,ans,new ArrayList<>());
            return ans;
        }
    }
}
