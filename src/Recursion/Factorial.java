package Recursion;

public class Factorial {

    // iterative approach:
    public int factIterativeApproach(int data)
    {
        int result = 1;
        for (int i=data; i>=1; i--){
            result = result*i;
        }
        return result;
    }

    // recursive approach:
    public int factorial(int data){
        if(data==1 || data==0){
            return 1;
        }else{
            return data * factorial(data-1);
        }
    }


    public static void main(String[] args) {
        Factorial f = new Factorial();
        int result=f.factIterativeApproach(5);
        System.out.println(result);
        int result1 = f.factorial(5);
        System.out.println(result1);
    }
}
