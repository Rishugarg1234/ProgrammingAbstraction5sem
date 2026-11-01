package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 1700 Number of Students unable to eat lunch
public class LeetCodeProblem1700 {
    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            Queue<Integer>q = new LinkedList<>();
            for(int student:students){
                q.offer(student);
            }
            // int stuIndex=0;
            int rotation=0;
            for(int i=0;i<sandwiches.length;i++){
                while(!q.isEmpty()&& rotation<q.size()){
                    if(q.peek()==sandwiches[i]){
                        q.poll();
                        rotation=0;
                        break;
                    }
                    else{
                        q.offer(q.poll());
                        rotation++;
                    }
                }
            }
            return q.size();
        }
    }
}
