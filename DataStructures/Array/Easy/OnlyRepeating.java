package DataStructures.Array.Easy;
// Problem #DArE11: Given an array arr[] of size n filled with numbers from 1 to n-1 in random order. The array has only one repetitive element. The task is to find the repetitive element.

public class OnlyRepeating{
    static int findRepeatingNum_Brute(int[] num){
        if(num == null || num.length == 0){ return -1; }

        for(int i = 0; i <num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] == num[j]){
                    return num[i];
                }
            }
        }
        return -1;
    }

    static int findRepeatingNum_SumApp(int[] num){
        if(num == null || num.length == 0){ return -1; }

        int n = num.length-1;
        int actualSum = 0;
        int expSum = (n*(n+1))/2;

        for(int e : num){
            actualSum += e;
        }
        return actualSum-expSum;
    }

    static int findRepeatingNum_XOR(int[] num){
        if(num == null || num.length == 0){ return -1; }

        int xor = 0;
        for(int i = 0;  i < num.length; i++){
            xor ^= num[i];

            if(i < num.length-1){
                xor ^= i+1;
            }   
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] num = {2,5,3,1,4,3};

        int result =  findRepeatingNum_Brute(num);
        System.out.printf("Repeating num is: %d%n", result);

        result = findRepeatingNum_SumApp(num);
        System.out.printf("Repeating num is: %d%n", result);

        result = findRepeatingNum_XOR(num);
        System.out.printf("Repeating num is: %d%n", result);
    }

}