package Array.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Ques7 {

/*
    7. **Rotate an Array by K Positions**
            - Input: [1, 2, 3, 4, 5], K = 2
            - Output: [4, 5, 1, 2, 3]
*/

    //way2:
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayByk(int[] arr,int k){
        // 1)rotate full array | 2) rotate till k elements | 3) rotate from k to end of the array
        int end = arr.length-1;

        reverse(arr,0,end);
        reverse(arr,0,k-1);
        reverse(arr,k,end);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        rotateArrayByk(arr,k);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int x:arr){
//            arrayList.add(x);
//        }
//
//        int count=0;
//        while(count<k){
//            arrayList.addFirst(arrayList.getLast());
//            arrayList.removeLast();
//            count++;
//        }
//        System.out.println(arrayList);
    }
}
