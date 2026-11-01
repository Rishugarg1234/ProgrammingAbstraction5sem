package LeetCodeProblems;
import java.util.*;
// LeetCode Problem 71: Simplify path
public class LeetCodeProblem71 {
    class Solution {
        public String simplifyPath(String path) {
            Stack<String>st =new Stack<>();
            String []parts = path.split("/");
            for(String s:parts){
                if(s.equals("")||s.equals(".")){
                    continue;
                }
                if(s.equals("..")){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }
                else{
                    st.push(s);
                }
            }
            StringBuilder ans = new StringBuilder();
            for(String f:st){
                ans.append("/");
                ans.append(f);
            }
            if(ans.length()==0){
                ans.append("/");
            }
            return ans.toString();
        }
    }
}
