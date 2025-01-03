package Array.Practice;

public class Ques5 {

/*
    5. **Find the Second Largest Element**
            - Input: [10, 20, 30, 40]
            - Output: 30
*/

    public static int secondLargest(int[] arr){
        if(arr==null || arr.length<=2){
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secLargest=largest;
                largest=arr[i];
            }
            else if(secLargest<arr[i] && largest!=arr[i]){   // handling duplicate and if second lar is bigger at end.
                secLargest = arr[i];
            }
        }
        // if all duplicate values:
        if (secLargest == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE; // Not enough distinct elements
        }

        return secLargest;

    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,40,35};
//        int[] arr = {};
//        int[] arr = {10};
//        int[] arr = {10,10,10};
        int result = secondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found.");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }
}
