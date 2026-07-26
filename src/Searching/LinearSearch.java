package Searching;

public class LinearSearch {
    static int linearSearch(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,30,20,40,90};
        int target = 30;
        int ans = linearSearch(arr,target);
        if(ans == -1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element Found at index:"+ans);
        }
    }

}
