package Array;

import java.util.Arrays;

public class ZerosAtEnd_5 {

    public int[] zeroAtEnd(int[] arr){

        int n = arr.length;
        int j = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,0,2,1,0,3};         //8,1,2,1,3,0,0
        ZerosAtEnd_5 obj = new ZerosAtEnd_5();
        int[] arr1 = obj.zeroAtEnd(arr);
        System.out.println(Arrays.toString(arr1));


    }
}
