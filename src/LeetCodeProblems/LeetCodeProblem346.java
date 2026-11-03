
package LeetCodeProblems;

import java.util.LinkedList;
import java.util.Queue;
//LeetCode Problem 346 : Moving Average From Data Stream
public class LeetCodeProblem346 {

    static class MovingAverage {
        private Queue<Integer> queue;
        private int maxSize;
        private double sum;

        public MovingAverage(int size) {
            this.maxSize = size;
            this.queue = new LinkedList<>();
            this.sum = 0.0;
        }

        public double next(int val) {

            // Remove oldest number if window is full
            if (queue.size() == maxSize) {
                sum -= queue.poll();
            }

            // Add new number
            queue.offer(val);
            sum += val;

            // Return average
            return sum / queue.size();
        }
    }

    public static void main(String[] args) {

        MovingAverage obj = new MovingAverage(3);

        System.out.println(obj.next(1));   // 1.0
        System.out.println(obj.next(5));   // 3.0
        System.out.println(obj.next(10));  // 5.333333333333333
        System.out.println(obj.next(25));  // 13.333333333333334
    }
}
