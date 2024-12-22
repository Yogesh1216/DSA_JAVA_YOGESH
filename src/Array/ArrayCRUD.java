package Array;

import java.util.Arrays;

public class ArrayCRUD {

    public static void main(String[] args) {
        // create
        int[] arr = {4,6,2,4,7};
        int arr1[] = new int[5];

        // read
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //update:
        arr[0]= 10;
        System.out.println(Arrays.toString(arr));

        /*
           delete : deleting an element involves setting the value to its default (e.g., 0, null or -1 for int),
                    as arrays are fixed-size. A full removal isn't possible without creating a new array.
        */
        arr[0]=0;
        System.out.println(Arrays.toString(arr));
    }
}
