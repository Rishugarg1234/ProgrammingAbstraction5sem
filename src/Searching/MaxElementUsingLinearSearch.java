package Searching;

public class MaxElementUsingLinearSearch {
    static int Maxim(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10,30,20,40,90};
        int ans = Maxim(arr);

        System.out.print(ans);
    }
}
