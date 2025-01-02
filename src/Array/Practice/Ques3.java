package Array.Practice;

public class Ques3 {

/*
    3. **Check if an Array is Sorted**
            - Input: [1, 2, 3, 4, 5]
            - Output: True
   - Input: [5, 3, 2, 4, 1]
            - Output: False
*/

    public static void arrayIsSorted(int[] nums){
        int first = nums[0];
        int second = nums[1];
        String check = first>second?"desc":"asc";

        if(check.equals("asc")){
            for(int x:nums){
                if(first<=x){
                    first = x;
                }else{
                    System.out.println("array is not sorted");
                    return;
                }
            }
        }else{
            for(int x:nums){
                if(first>=x){
                    first=x;
                }else{
                    System.out.println("array is not sorted");
                    return;
                }
            }
        }
        System.out.println("array is sorted in "+check+" order");
    }


    //
    public static void arrayIsSorted1(int[] nums){
        // this work only if array is in ascending order.
        for(int i=0 ; i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                System.out.println(" arrayIsSorted1 : array is not sorted");
                return;
            }
        }
        System.out.println("array is sorted");
    }

    // best sol
    public static boolean arrayIsSorted2(int[] nums){
        if(nums==null || nums.length<=1){
            return true;
        }

        int prev = nums[0];
        int next = nums[1];
        boolean isAscending = nums[0] < nums[1];

        if(isAscending){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }else{
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,9};
        //int[] nums = {7,9,4,3,2};
        arrayIsSorted(nums);
        arrayIsSorted1(nums);

        boolean resust = arrayIsSorted2(nums);
        System.out.println(resust);


    }
}
