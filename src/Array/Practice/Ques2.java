package Array.Practice;

import java.util.Arrays;

public class Ques2 {

/*
    2. **Reverse an Array**
            - Input: [1, 2, 3, 4, 5]
            - Output: [5, 4, 3, 2, 1]
*/

    public static void reverseArray(int[] nums){
        // handle if nums array is null
        if(nums==null || nums.length==0){
            System.out.println("nums array is empty");
            return;
        }

        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        reverseArray(nums);
    }

}
