package Array.Practice;

public class Ques1 {
        /*
            1. **Find the Largest and Smallest Elements in an Array**
                    - Input: [3, 1, 4, 1, 5]
                    - Output: Largest = 5, Smallest = 1
        */


    public static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }











    public static void findMinMaxInArray(int[] nums){
        // handle if nums array is null
        if(nums==null || nums.length==0){
            return;
        }

        //initialize variables
        int min = nums[0];
        int max = nums[0];

        //traverse array
        for(int x:nums){
            if(min>x){
                min = x;
            }
            if(max<x){
                max = x;
            }
        }

        System.out.println("smallest value: "+min);
        System.out.println("largest value: "+max);
    }

    public static void main(String[] args) {

        int[] nums = {3,1,4,1,5};
        int minValue = findMin(nums);
        int maxValue = findMax(nums);
        findMinMaxInArray(nums);
        System.out.println("Minimum value of array is: "+minValue);
        System.out.println("Maximum value in array is: "+maxValue);

    }
}



/*
    better solutions:
    assign 1st value of array as min or max
    use modern way to traverse.
 */

