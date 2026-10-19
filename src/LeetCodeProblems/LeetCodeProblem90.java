package LeetCodeProblems;
import java.util.*;
//LeetCode Problem90 : Subsets II
public class LeetCodeProblem90 {
    class Solution {
        public void subsets(int index,int []nums,List<List<Integer>>ans,List<Integer>ds){
            ans.add(new ArrayList<>(ds));
            for(int i=index;i<nums.length;i++){
                if(i>index && nums[i]==nums[i-1]){
                    continue;
                }
                ds.add(nums[i]);
                subsets(i+1,nums,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
            Arrays.sort(nums);
            subsets(0,nums,ans,new ArrayList<>());
            return ans;
        }
    }
}
