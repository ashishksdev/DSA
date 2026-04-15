package DataStructures.Array.Easy;

// Problem #DArE01 SortedArray (D: Data structure | A: Array | E: Easy | numbering 01)
public class SortedArray {
    // Function to check if an array is sorted (increasing order).
    static boolean isArraySorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) if(arr[i] > arr[i+1]) return false; // returns false if current element is greater than next element.
        return true;
    }

    public static void main(String[] args) {
        // Array
        int[] arr = {12,90,0,0,6,3,2};
        int[] arr02 = {2,9,9,12,17,20};

        // Calling function to check is array is sorted or not.
        System.out.printf("Array is sorted: %b\n", isArraySorted(arr));
        System.out.printf("Array is sorted: %b\n", isArraySorted(arr02));

    }
}