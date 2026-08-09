package Basics;
//Q9. Print all even numbers from 1 to 100.
public class evenNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
