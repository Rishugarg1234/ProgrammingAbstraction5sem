package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 1823 : Find The Winner Of The Circular Game
public class LeetCodeProblem1823 {

    class Solution {
        public int findTheWinner(int n, int k) {
            Queue<Integer>q = new LinkedList<>();
            for(int i=1;i<=n;i++){
                q.offer(i);
            }
            int count=1;
            while(q.size()>1){
                int friend = q.poll();
                if(count==k){
                    count=1;
                }
                else{
                    q.offer(friend);
                    count++;
                }
            }
            return q.peek();
        }
    }}
