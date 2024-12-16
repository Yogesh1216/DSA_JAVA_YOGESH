package Array;

public class SecondMax_4 {


    public int secondMax(int[] arr){
        // take 2 variables as max and second max with min values
        // start iterating over array and find max value
        // start assigning max value in second max if getting max value.

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n =arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return  secondMax;
    }

    public static void main(String[] args) {
        SecondMax_4 sm = new SecondMax_4();
        int[] arr = {13,34,2,34,33,1};
        int secMax=sm.secondMax(arr);
        System.out.println(secMax);
    }
}
