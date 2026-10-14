package LeetCodeProblems;
// LeetCode Problem 622 Design a Circular Queue
public class LeetCodeProblem622 {
    class MyCircularQueue {
        int front,rear,k;
        int arr[];
        public MyCircularQueue(int k) {
            this.k=k;
            front=-1;
            rear = -1;
            arr= new int[k];
        }

        public boolean enQueue(int value) {
            if((rear+1)%k == front){
                return false;
            }
            if(front==-1){
                front=rear=0;
                arr[front]=value;
            }
            else{
                rear = (rear+1)%k;
                arr[rear]=value;
            }
            return true;
        }

        public boolean deQueue() {
            if(front==-1){
                return false;
            }

            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%k;
            }
            return true;
        }

        public int Front() {
            if(front==-1){
                return -1;
            }
            else{
                return arr[front];
            }
        }

        public int Rear() {
            if(rear==-1){
                return -1;
            }
            else{
                return arr[rear];
            }
        }

        public boolean isEmpty() {
            return front==-1;
        }

        public boolean isFull() {
            return ((rear+1)%k == front);
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}
