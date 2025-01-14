package HeadFirstJava.ch1.ch2;

abstract public class Shape {

    public void rotate(){
        System.out.println("shape is rotating! ");
    }

    public void playSound(){
        System.out.println("shape is playing a sound! ");
    }
}

class Square extends Shape{

}

class Circle extends Shape{

}

class Triangle extends Shape{

}

class Amoeba extends Shape{

    public void rotate(){
        System.out.println("Amoeba is rotating.");
    }

    public void playSound(){
        System.out.println("Amoeba is playing sound.");
    }
}

class TestShape{

    public static void main(String[] args) {
        Circle c = new Circle();  // inheritance
        c.rotate();
        c.playSound();

        Amoeba a = new Amoeba();  // overriding
        a.rotate();
        a.playSound();
    }
}
