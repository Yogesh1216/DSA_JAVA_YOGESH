package Array;

public class MinValueInArray_3 {

    public int minValue(int[] arr){
        int min=arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinValueInArray_3 obj = new MinValueInArray_3();
        int[] arr = {5,3,6,8,7,2,4};
        int min = obj.minValue(arr);
        System.out.println(min);
    }
}
