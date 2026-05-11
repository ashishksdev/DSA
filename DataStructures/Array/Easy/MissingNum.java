package DataStructures.Array.Easy;
// Problem #DArE09: Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.

public class MissingNum {

    static int findMissingNumberBrute(int[] nums){
        if(nums == null){
            return -1;
        }

        for(int i = 1; i <= nums.length+1; i++){
            boolean isNumPresent = false;

            for(int j = 0; j < nums.length; j++){
                if(i == nums[j]){
                    isNumPresent = true;
                    break;
                }
            }
            if(!isNumPresent){
                return -1;
            }
        }
        return -1;
    }

    static int findMissingNumberOptimal(int[] nums){
        if(nums == null){
            return -1;
        }

        // Sum of N natural numbers = n(n+1)/2
        int n = nums.length+1;
        long expSum = (long)n*(n+1)/2;
        long actualSum = 0;

        for(int i = 0; i < nums.length; i++){
            actualSum += nums[i];
        }
        return (int)(expSum - actualSum);
    }

    static int findMissingNumberXOR(int[] nums){
        if(nums == null){
            return -1;
        }

        // XOR of n natural number.
        int xorSum = 0;
        for(int i = 1; i <= nums.length+1; i++){
            xorSum ^= i;
        }
        // XOR of elements of given array.
        for(int e : nums){
            xorSum ^= e;
        }
        return xorSum;
    }

    public static void main(String[] args){
        int[] nums = {3,4,1,2,5,8,9,6,10};
        int[] nums2 = null;
        
        int result = findMissingNumberBrute(nums); // Time Complexity: O(N^2) 
        System.out.printf("Missing Num: %d%n", result);
        result = findMissingNumberOptimal(nums); // Time Complexity: O(N)
        System.out.printf("Missing Num: %d%n", result);
        result = findMissingNumberXOR(nums); // Time complexity: O(N)
        System.out.printf("Missing Num: %d%n", result);
    }
}
