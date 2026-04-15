package DataStructures.Array.Easy;

/* Problem #DArE03: Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order.
Additionally, return the length of this distinct sorted subarray.
Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.
*/

import java.util.Arrays;
public class RemoveDuplicate {
    
    static int removeDuplicates(int[] arr){

        if(arr.length == 0) return 0; // For empty array.
        
        int uniqueIndex = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex+1; // Number of unique values = uniqueIndex+1, as uniqueIndex starts from 0.
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,5,7,9,9};
        int[] arr2 = {};

        int newLength = removeDuplicates(arr);
        System.out.printf("Resultant Array: %s\nNo. of unique values: %d", Arrays.toString(arr), newLength);
    }
}