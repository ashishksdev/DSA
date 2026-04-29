package DataStructures.Array.Easy;
// Problem #DAr06: Generate all the possible subarrays of given array.

public class SubArray {
    static void printSubarray(int[] arr){
        for (int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printSubarray(arr); // To print subarray of given array. Time Complexity O(n^3)
    }
}
