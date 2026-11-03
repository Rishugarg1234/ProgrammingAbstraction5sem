package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 649 : Dota 2 Senate
public class LeetCodeProblem649 {
    class Solution {
        public String predictPartyVictory(String senate) {
            Queue<Integer>radiantq = new LinkedList<>();
            Queue<Integer>direq = new LinkedList<>();

            int n = senate.length();
            for(int i=0;i<n;i++){
                if(senate.charAt(i)=='R'){
                    radiantq.offer(i);
                }
                else{
                    direq.offer(i);
                }
            }
            while(!radiantq.isEmpty()&&!direq.isEmpty()){
                int r = radiantq.poll();
                int d = direq.poll();

                if(r<d){
                    radiantq.offer(r+n);
                }
                else{
                    direq.offer(d+n);
                }

            }
            if(radiantq.isEmpty()){
                return "Dire";
            }
            else{
                return "Radiant";
            }
        }
    }
}
