package Array.Practice;

import java.util.ArrayList;

public class Ques7 {

/*
    7. **Rotate an Array by K Positions**
            - Input: [1, 2, 3, 4, 5], K = 2
            - Output: [4, 5, 1, 2, 3]
*/

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int x:arr){
            arrayList.add(x);
        }

        int count=0;
        while(count<k){
            arrayList.addFirst(arrayList.getLast());
            arrayList.removeLast();
            count++;
        }
        System.out.println(arrayList);
    }
}
