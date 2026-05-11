package DataStructures.Array.Easy;
// Problem: #DAr08: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

public class MaxConsecutiveOne {
    static int findMaxConsecutiveOne(int[] arr){
        if(arr == null){
            return 0;
        }

        int max = 0, count = 0;

        for (int num : arr) {
            if(num == 1){
                count++;
                if(count > max){
                    max = count;
                }

            } else{
                count = 0;
            } 

        } return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,1,1,0,1,1,1,1};
        int result = findMaxConsecutiveOne(arr); // Time complexity: O(n)
        System.out.printf("Max consecutive one: %d%n", result);
    }
}