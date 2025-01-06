package OOPs.Exercise1;

public class Person {

    String name;
    int age;
    static int count;

    public Person(){
        count++;
    }

    public static void numberOfPersons(){
        System.out.println("Total Persons: "+count);
    }

    public Person(String name , int age){
        this();     // calls constructor of this class | super() - calls parent class constructor.
        this.name = name;
        this.age = age;
    }

    void PersonDetails(){
        System.out.println("Name: "+name+ " Age: "+age);
    }

    // polymorphism: overloading
    void walk(){
        System.out.println(name+" is walking");
    }
    void walk(int steps){
        System.out.println(name+" is walking "+steps);
    }

    public static void main(String[] args) {
            Person p1 = new Person("yogesh",26);
            Person p2 = new Person("Rohit",33);
            p1.PersonDetails();
            p2.PersonDetails();
            Person.numberOfPersons();
            p1.walk();
            p1.walk(4);
            Developer d1 = new Developer("Sahil",25);
            d1.PersonDetails();


    }
}

class Developer extends Person{
    public Developer(String name,int age){
        super(name,age);  // calls constructor of parent class.
    }
}