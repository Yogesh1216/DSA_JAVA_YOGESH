package Array.Practice;

import java.util.ArrayList;

public class Ques9 {

/*
    9. **Count the Frequency of Each Element in an Array**
            - Input: [1, 2, 2, 3, 3, 3]
            - Output: {1: 1, 2: 2, 3: 3}
*/

    public static void main(String[] args) {
        int[] arr ={1, 2, 2, 3, 3, 3,2};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int x : arr){
            if(!arrayList.contains(x)){
                arrayList.add(x);
            }
        }
        for(int i=0;i<arrayList.size();i++){
            int count=0;
            for(int x:arr){
                if(x==arrayList.get(i)){
                    count++;
                }
            }
            System.out.println(arrayList.get(i)+" : "+count);
        }

    }
}
