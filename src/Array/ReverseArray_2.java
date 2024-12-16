package Array;

public class ReverseArray_2 {

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] reverseArray(int[] arr){

        // create new array for assigning reverse array of same length.
        int n = arr.length;
        int[] reversed = new int[n];

        // back traverse like last to 0 and assign values.
        int j=0;
        for(int i=n-1 ; i>=0;i--){
            reversed[j] = arr[i];
            j++;
        }
        // return reversed array
        return reversed;
    }

    public int[] reverseArray1(int[] arr){
        // two pointer technique
        int start = 0;
        int end = arr.length-1;

        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6,17,5,9,12};
        ReverseArray_2 ra = new ReverseArray_2();
        int[] revArr =ra.reverseArray(arr);
        int[] revArr1 = ra.reverseArray1(arr);
        printArray(revArr);
        printArray(revArr1);

    }

}
