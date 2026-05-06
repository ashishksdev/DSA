package DataStructures.Array.Easy;
// Problem #DArE07: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.


public class SecondLargestSmallest {

    static void smallAndLarge(int[] nums){
        //For absence of second small or small or large or second large.
        if(nums.length==0 || nums.length==1){
            System.out.print(-1);
            return;
        } 

        int small = Integer.MAX_VALUE, secondSmall = small;
        int large = Integer.MIN_VALUE, secondLarge = large;

        // For large and second large
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > large) {
                secondLarge = large;
                large = nums[i];
            } else if(nums[i] > secondLarge){
                secondLarge = nums[i];
            }
        }

        // For small and second small
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < small) {
                secondSmall = small;
                small = nums[i];
            } else if(nums[i] < secondSmall){
                secondSmall = nums[i];
            }
        }

        System.out.printf("Large: %d\nSecond Large: %d\nSecond small: %d\nSmall: %d", large,secondLarge,secondSmall,small);
    }

    public static void main(String[] args) {
        int[] nums = {12,2,0,9,-4,5,8,9,3,5};
        int[] nums2 = {};
        int[] nums3 = {2};
        int[] nums4 = {2,3};
        smallAndLarge(nums);  // Time complexity: O(n)
    }
}
