package Array.Practice;

public class Ques4 {

/*
    4. **Find the Sum of All Elements in an Array**
            - Input: [10, 20, 30]
            - Output: 60
*/

    public static int sumOfArray(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }

        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int result = sumOfArray(arr);
        System.out.println(result);
    }
}
