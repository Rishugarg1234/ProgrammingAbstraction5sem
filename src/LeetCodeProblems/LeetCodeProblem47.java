package LeetCodeProblems;
import java.util.*;
// LeetCode Problem 47 = PermutationII
public class LeetCodeProblem47 {
    class Solution {
        public void permutation(int []nums,List<List<Integer>>ans,List<Integer>ds,boolean []used){
            if(ds.size()==nums.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(used[i]||i>0 && nums[i]==nums[i-1] && !used[i-1]){
                    continue;
                }
                used[i]=true;
                ds.add(nums[i]);
                permutation(nums,ans,ds,used);
                used[i]=false;
                ds.remove(ds.size()-1);
            }
        }
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
            boolean []used = new boolean[nums.length];
            Arrays.sort(nums);
            permutation(nums,ans,new ArrayList<>(),used);
            return ans;
        }
    }
}
