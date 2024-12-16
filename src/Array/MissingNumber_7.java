package Array;

public class MissingNumber_7 {

    public int missingNo(int[] arr){
        int n = arr.length+1;  // 1 is added because 1 num is missing.
        int sum = n*(n+1)/2;
        for(int i=0; i<n-1; i++){
            sum = sum - arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5};
        MissingNumber_7 obj = new MissingNumber_7();
        int missNo = obj.missingNo(arr);
        System.out.println(missNo);
    }
}
