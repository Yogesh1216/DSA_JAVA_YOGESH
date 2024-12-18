package Recursion;

public class PrintNumbers {

    // print no from 5 to 1
    public void printno1(int data){
        if(data==0){
            return;
        }else{
            System.out.println(data);
            printno1(data-1);
        }
    }

    // print no from 1-5:
    public void printno2(int data){
        if(data==6){
            return;
        }
        System.out.println(data);
        printno2(data+1);
    }

    // print sum of first n natural no's using recursion:
    public int sumOfNNaturalNos(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNNaturalNos(n-1);
    }

    public static void main(String[] args) {
        PrintNumbers obj = new PrintNumbers();
        obj.printno1(5);
        obj.printno2(1);
        int result = obj.sumOfNNaturalNos(5);
        System.out.println(result);
    }

}
