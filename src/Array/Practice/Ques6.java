package Array.Practice;

import java.util.ArrayList;
import java.util.Arrays;

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


    //way 2:
    public static void removeDuplicates1(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }

        //printing new array
        for(int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        removeDuplicates1(arr);
    }
}
