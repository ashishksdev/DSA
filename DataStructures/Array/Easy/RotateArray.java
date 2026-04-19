package DataStructures.Array.Easy;

// Problem #DAr05: Rotate an array by k positions, in left direction.
public class RotateArray{
    
    static int[] bruteRotation(int[] arr, int k){
        // If array is null
        if(arr.length==0) return arr;

        int temp;
        for(int i=0; i<k; i++){
            temp = arr[0];
            for(int j=1; j<arr.length; j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }

    static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;

        }
    }

    static int[] optimalRotation(int[] arr, int k){
        // If array is null
        if(arr.length==0) return arr;

        // Reverse first k elements of array.
        reverseArray(arr, 0,k-1);
        //Reverse rest of the elements from k th index.
        reverseArray(arr, k, arr.length-1);
        // Reverse complete array
        reverseArray(arr, 0, arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        System.out.print(java.util.Arrays.toString(optimalRotation(arr, 3)));

    }
}