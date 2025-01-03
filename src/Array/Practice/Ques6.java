package Array.Practice;

import java.util.ArrayList;

public class Ques6 {

/*
    6. **Remove Duplicates from a Sorted Array**
            - Input: [1, 1, 2, 2, 3, 3, 4]
            - Output: [1, 2, 3, 4]
*/

    public static void removeDuplicates(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int x:arr){
            if(!newArr.contains(x)){
                newArr.add(x);
            }
        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(arr);
    }
}
