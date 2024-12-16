package Array;

import java.util.Arrays;

public class ResizeArray_6 {

    public static int[] resizeArray(int[] arr ,int capacity){
        int[] resizedArray = new int[capacity];
        int n = arr.length;
        for(int i=0;i<n;i++){
            resizedArray[i] = arr[i];
        }
        return resizedArray;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,3,10};
        int[] resArray = resizeArray(arr,8);
        System.out.println(Arrays.toString(resArray));
    }
}
