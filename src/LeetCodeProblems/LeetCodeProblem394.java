package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 394: Decode Strings
public class LeetCodeProblem394 {
    class Solution {
        public String decodeString(String s) {
            Stack<Integer>cStack = new Stack<>();
            Stack<String>sStack = new Stack<>();
            int cNumber=0;
            String sString="";
            for(char ch:s.toCharArray()){
                if(Character.isDigit(ch)){
                    cNumber = cNumber*10+(ch-'0');
                }
                else if(ch=='['){
                    cStack.push(cNumber);
                    sStack.push(sString);
                    cNumber=0;
                    sString="";
                }
                else if(ch==']'){
                    int c = cStack.pop();
                    String pString = sStack.pop();
                    StringBuilder temp = new StringBuilder();
                    for(int i=0;i<c;i++){
                        temp.append(sString);
                    }
                    sString =  pString+temp.toString();
                }
                else{
                    sString+=ch;
                }
            }
            return sString;
        }
    }
}
