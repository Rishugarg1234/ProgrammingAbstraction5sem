package LeetCodeProblems;
import java.util.*;
// LeetCode Problem 402 : Remove K digits
public class LeetCodeProblem402 {
    class Solution {
        public String removeKdigits(String num, int k) {
            Stack<Character>st = new Stack<>();
            for(int i=0;i<num.length();i++){
                while(!st.isEmpty()&& k>0 && st.peek()>num.charAt(i)){
                    st.pop();
                    k--;
                }
                st.push(num.charAt(i));
            }
            while(k>0){
                st.pop();
                k--;
            }
            if(st.isEmpty()){
                return "0";
            }
            String ans="";
            int size = st.size();
            for(int i=0;i<size;i++){
                char ch = st.pop();
                ans= ch+ans;
            }
            String result="";
            boolean ZeroFound=true;
            for(int i=0;i<ans.length();i++){
                char ch = ans.charAt(i);
                if(ch=='0' && ZeroFound){
                    continue;
                }
                ZeroFound=false;
                result+=ch;
            }
            if(result.length()==0){
                return "0";
            }
            return result;
        }
    }
}
