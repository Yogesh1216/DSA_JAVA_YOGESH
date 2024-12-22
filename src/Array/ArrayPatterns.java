package Array;

import java.util.Arrays;

public class ArrayPatterns {
    /*
    Common Patterns :
    1) Two Pointer Technique -
      i)The Array/List is Sorted: Many problems involve sorted arrays where two-pointer traversal is ideal.
      ii)Searching for Pairs or Triplets: Problems that involve finding pairs or triplets with specific conditions, like a target sum.
      iii)Finding Subarrays or Subsequences: Tasks like finding a subarray with specific properties (e.g., sum, length, distinct elements).
      iv)Minimizing or Maximizing Values: Problems that involve comparing elements at both ends of the array.
       v)Partitioning or Rearranging: Tasks like separating positive and negative numbers, or 0s and 1s.
      vi)String/Array Comparisons: Problems where you compare elements at two positions, such as checking if a string is a palindrome.
     */

    public static int[] findPair(int[] nums,int targetSum){
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==targetSum){
                return new int[] {i,j};
            }
            else if(nums[i]+nums[j]>targetSum){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }

    public static boolean isPalindrome(String name){
        int s1 = 0;
        int l1 = name.length()-1;
        while(s1<l1){
            if(name.charAt(s1)!=name.charAt(l1)){
                return false;
            }
            s1++;
            l1--;
        }
        return true;
    }

    public static void moveZeros(int[] arr){
        int j = 0;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }


    public static void main(String[] args) {
        //1. Find a Pair with a Given Sum (Sorted Array)
        int[] nums = {2,7,11,15};
        int targetSum = 13;

        int[] pair = findPair(nums,targetSum);
        System.out.println(Arrays.toString(pair));


        //2. Check if a String is a Palindrome
        String name = "naman";
        boolean result = isPalindrome(name);
        System.out.println(result);

        //3. Move All Zeroes to the End
        int[] arr2 = {2,1,0,3,0,12};
        moveZeros(arr2);

    }
}
