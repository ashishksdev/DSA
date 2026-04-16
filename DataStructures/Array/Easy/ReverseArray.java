package DataStructures.Array.Easy;

// Problem: #DArE04 Revrse the positions of elements in an array.

import java.util.Arrays;
public class ReverseArray {
    static String reverseArray(int[] arr){
         
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]){
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        }
        return Arrays.toString(arr);
    }
    
    public static void main(String[] args) {
        int[] arr = {3,3,5,2,7,0,9,7,5,8};
        System.out.print(reverseArray(arr));
    }
}
