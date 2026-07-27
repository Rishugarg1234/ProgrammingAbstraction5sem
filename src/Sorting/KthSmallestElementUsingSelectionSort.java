package Sorting;
import java.util.*;
public class KthSmallestElementUsingSelectionSort {
    public static void KthSmallestElement(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;


        }
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {9,4,7,1,5,2};
        int k = 3;
        KthSmallestElement(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        System.out.println(k+"rd Smallest Element: "+arr[k-1]);
    }
}
