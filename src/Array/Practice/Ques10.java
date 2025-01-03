package Array.Practice;

import java.util.Arrays;

public class Ques10 {

/*
    10. **Merge Two Sorted Arrays**
            - Input: [1, 3, 5] and [2, 4, 6]
            - Output: [1, 2, 3, 4, 5, 6]
*/

    public static void main(String[] args) {
        int[] arr1 ={1,3,5};
        int[] arr2 ={2,4,6};
        int[] sortedArray = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            sortedArray[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            sortedArray[arr1.length+j]=arr2[j];
        }
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}
