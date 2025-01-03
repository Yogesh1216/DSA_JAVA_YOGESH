package Array.Practice;

public class Ques8 {

/*
    8. **Find the Missing Number in a Range (1 to N)**
            - Input: [1, 2, 3, 5] (N = 5)
            - Output: 4
*/

    public static void main(String[] args) {

        int[] arr = {1,2,3,5};
        int N=5;

        int totalSum = N*(N+1)/2;
        int sum=0;
        for(int x:arr){
            sum +=x;
        }
        System.out.println("missing no: "+(totalSum-sum));

    }
}
