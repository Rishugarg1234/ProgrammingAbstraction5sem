package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 49 Group Anagrams
public class LeetCodeProblem49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>>map = new HashMap<>();

            for(String str : strs){
                char []arr = str.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }
}
