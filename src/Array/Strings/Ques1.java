package Array.Strings;

public class Ques1 {

/*
    1. **Reverse a String**
    Write a program to reverse a given string.
    Input: `"hello"`
    Output: `"olleh"`
*/
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        String revString = sb.reverse().toString();
        System.out.println(revString);
    }

public static void main(String[] args) {

    String str = "hello";
    //reverseString(str);

    StringBuilder sb = new StringBuilder("Hello");

    // Append
    sb.append(", Java!");
    System.out.println("After append: " + sb);
    }
}
