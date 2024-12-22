package Array;

import java.util.ArrayList;
import java.util.Arrays;

/*
add(element)	Adds an element to the end of the list.
get(index)	Retrieves the element at a given index.
set(index, value)	Updates the element at a given index.
remove(index)	Removes the element at a given index.
remove(value)	Removes the first occurrence of a value.
*/

public class ArrayListCRUD {


    public static void main(String[] args) {

        // create
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // read
        System.out.println(fruits.getFirst());
        System.out.println(fruits.get(1));

        System.out.println("for loop");
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        System.out.println("enhanced for loop");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //update:
        fruits.set(1,"lichi");
        System.out.println(fruits);
        fruits.add("banana");
        System.out.println(fruits);

        //delete:
        fruits.remove(3);
        System.out.println(fruits);
    }
}
