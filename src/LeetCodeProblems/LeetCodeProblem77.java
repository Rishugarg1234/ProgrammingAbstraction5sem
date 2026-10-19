package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 77: Combinations

public class LeetCodeProblem77 {
    class Solution {
        public void findCombination(int index,int n, int k, List<List<Integer>>ans,List<Integer>ds){
            if(ds.size()==k){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i=index;i<=n;i++){
                ds.add(i);
                findCombination(i+1,n,k,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>>ans = new ArrayList<>();
            findCombination(1,n,k,ans,new ArrayList<>());
            return ans;
        }
    }
}
