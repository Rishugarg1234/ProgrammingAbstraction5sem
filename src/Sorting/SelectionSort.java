package Sorting;
import java.util.*;
public class SelectionSort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {5,3,8,4,2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
