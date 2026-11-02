package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 901: Online Stack Span
public class LeetCodeProblem901 {
    class StockSpanner {
        Stack<int[]>st;
        int index=-1;
        public StockSpanner(){
            st = new Stack<>();

        }

        public int next(int price) {
            index++;
            while(!st.isEmpty()&&st.peek()[1]<=price){
                st.pop();
            }
            int span=0;
            if(st.isEmpty()){
                span=index+1;
            }
            else{
                span = index-st.peek()[0];
            }
            st.push(new int[]{index,price});
            return span;
        }
        //Brute Force
        // ArrayList<Integer>arr;
        // public StockSpanner(){
        //     arr = new ArrayList<>();

        // }

        // public int next(int price) {
        //     arr.add(price);
        //     int count=1;
        //     for(int i=arr.size()-2;i>=0;i--){
        //         if(arr.get(i)<=price){
        //             count++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     return count;
        // }
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
