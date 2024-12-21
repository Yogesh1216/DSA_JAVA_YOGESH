package Exercise.Day1;


import java.util.Arrays;

// 1) Two Sum
    //| 2) best time to buy and sell stock | 3) Majority Element | 4) Move zeros | 5) Square of sorted Array | 6)Merge Sorted array
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
public class Day1_TwoSum {
    public int[] TwoSum(int[] nums,int target){
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                int[] result = {i,j};
                return result;
            }else{
                if(target<nums[i]+nums[j]){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return null;
    }



    //class Solution {
        public int[] Solution(int[] nums, int target) {
            int i = 0;
            int j = nums.length - 1;
            Arrays.sort(nums);
            while(i<j){
                if(nums[i]+nums[j]==target){
                    int[] result = {i,j};
                    return result;
                }
                else{
                    if(target>nums[i]+nums[j]){
                        i++;
                    }else{
                        j--;
                    }
                }
            }
            return null;
        }
    //}


    public static void main(String[] args){
        int[] nums ={3,2,4};
        int target = 6;

        Day1_TwoSum obj = new Day1_TwoSum();
        int[] result=obj.Solution(nums,target);
        System.out.println(Arrays.toString(result));

    }
}




// using nested loop = O(n^2)
// hashmap = O(n)
//
