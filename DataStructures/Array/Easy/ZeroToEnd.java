package DataStructures.Array.Easy;

// Problem #DArE05 Move all the elements valued 0 in an array at the end.

import java.util.Arrays;
public class ZeroToEnd {
    static String moveZeroToEndInArray(int[] arr){
        int nonZeroIdx = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIdx] = arr[i];
                if(i != nonZeroIdx) arr[i] = 0;
                nonZeroIdx++;
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[]  arr = {2,0,8,3,6,8,0,0,6,7,0,5,0};
        System.out.print(moveZeroToEndInArray(arr));
    }
}
