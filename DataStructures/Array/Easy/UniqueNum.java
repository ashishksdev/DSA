package DataStructures.Array.Easy;
// Problem #DArE10: Given an array of integers, every element in the array appears twice except for one element which appears only once. The task is to identify and return the element that occurs only once.

public class UniqueNum {
    static int findNonRepeatingNum(int[] num){
        if(num ==  null){
            return -1;
        }

        int xorSum = 0;
        for(int e : num){
            xorSum ^= e;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] num = {2,7,9,3,2,9,5,5,7};
    
        int result = findNonRepeatingNum(num);
        System.out.printf("Non-Repeating num: %d%n", result);
    }
}
