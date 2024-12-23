package Array;

import java.util.Arrays;

public class PrefixSumExamples {
    // 1) Given an array, find the sum of elements between indices l and r efficiently.
    public static int sumOfRange(int[] arr,int startIndex,int endIndex){
        //prefix sum:
        int[] prefixSumArray = new int[arr.length];
        prefixSumArray[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSumArray[i]=prefixSumArray[i-1]+arr[i];
        }
        return prefixSumArray[endIndex]-prefixSumArray[startIndex-1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = sumOfRange(arr,1,3);
        System.out.println(result);

    }
}
