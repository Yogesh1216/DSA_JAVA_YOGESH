package Array;

import java.util.Arrays;

public class Top5QuesArray {

    public static void main(String[] args) {
        // 1. Find the Second Largest Element
        int[] arr = {12, 35,35, 1, 10, 34, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        // limitations of the above sol:- will give wrong sol if duplicate values are there.
        // sort will change the current array , if we need to maintain current array we need to create copy.
        // Unnecessary Sorting O(nlogn)

        // optimized solution: O(n)
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);



        // 2. Rotate an Array
        System.out.println("Rotate an Array");
        int[] arr1 = {1, 2, 3, 4, 5};
        int k = 2;
        //two pointer technique:
//        int i=0;
//        int j=arr1.length-1;
//        while(i<j){
//            int temp = arr1[i];
//            arr1[i]=arr1[j];
//            arr1[j]=temp;
//            i++;
//            j--;
//        }
        for(int i=0;i<arr1.length;i++){
            int temp = arr[i+k];
            arr[i+k]=arr[i];

        }


        System.out.println(Arrays.toString(arr1));
        System.out.println("hello");




        // 3. Find Pair with a Given Sum


        // 4. Remove Duplicates


        // 5. Merge Two Sorted Arrays




    }

}
