package Array;

public class RemoveEvenIntegers {

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] removeEvenInt(int[] arr){

        // find how many odd int are there in an array
        int oddInt = 0;
        int n = arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]%2!=0){
                oddInt++;
            }
        }

        // create new array with same length
        int[] arrWithOddInt = new int[oddInt];

        // check for odd int and start assigning to new arr
        int odd = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]%2!=0){
                arrWithOddInt[odd] = arr[i];
                odd++;
            }
        }

        return arrWithOddInt;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        RemoveEvenIntegers rei = new RemoveEvenIntegers();
        int[] arr1 =rei.removeEvenInt(arr);
        rei.printArray(arr1);
    }
}
