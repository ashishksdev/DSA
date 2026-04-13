package DataStructures.Array.Easy;
import java.util.ArrayList;

public class LeadersInArray {
    // Functon to find all leaders in an array. Brute force method. Time complexity: O(mxn)
    static String brute(int[] arr) {
        // ArrayList of Leaders
        ArrayList<Integer> leaderList = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            boolean leader = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    leader = false;
                    break;
                }
                if (leader==true && j == arr.length-1) leaderList.add(arr[i]);
            }
        }
        return leaderList.toString();
    }

    static String optimal(int[] arr){
        ArrayList<Integer> leaderList = new ArrayList<>(); // ArrayList of Leader
        int leader = arr[arr.length-1];
        leaderList.add(leader);

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]> leader){
                leader = arr[i];
                leaderList.add(leader);
            } 
        }
        return leaderList.toString();
    }

    public static void main(String[] args) {
        int[] arr = {12,0,0,3,4,7,7,9,0,8,2,2};
        int[] arr2 = {12,0,0,3,4,7,7,9,0,8,2,1,2};
        System.out.print(brute(arr));
        System.out.print(optimal(arr));
    }
}
