package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 950: Reveal Cards in Increasing Order
public class LeetCodeProblem950 {
    class Solution {
        public int[] deckRevealedIncreasing(int[] deck) {
            Arrays.sort(deck);
            int n = deck.length;
            int ans[] = new int [n];
            Queue<Integer>q = new LinkedList<>();
            for(int i=0;i<n;i++){
                q.add(i);
            }
            for(int cards:deck){
                int index = q.poll();
                ans[index]=cards;
                if(!q.isEmpty()){
                    q.add(q.poll());
                }
            }
            return ans;
        }
    }
}
