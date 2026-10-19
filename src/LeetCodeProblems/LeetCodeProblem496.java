package LeetCodeProblems;
import java.util.*;

//LeetCode Problem496 : Next Greator Element I
public class LeetCodeProblem496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            //Brute Force
            // int nge[]=new int [nums1.length];
            // for(int i=0;i<nums1.length;i++){
            //     nge[i]=-1;
            //     for(int j=0;j<nums2.length;j++){
            //         if(nums1[i]==nums2[j]){
            //             for(int k=j+1;k<nums2.length;k++){
            //                 if(nums2[k]>nums1[i]){
            //                     nge[i]=nums2[k];
            //                     break;
            //                 }
            //             }
            //             break;
            //         }
            //     }
            // }
            // return nge;

            int nge2 []= new int[nums2.length];
            Stack<Integer>st = new Stack<>();
            for(int i=nums2.length-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<=nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nge2[i]=-1;
                }
                else{
                    nge2[i]=st.peek();
                }
                st.push(nums2[i]);
            }

            int nge1[]=new int [nums1.length];
            for(int i=0;i<nums1.length;i++){
                nge1[i]=-1;
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        nge1[i]=nge2[j];
                        break;
                    }
                }
            }
            return nge1;
        }
    }
}
