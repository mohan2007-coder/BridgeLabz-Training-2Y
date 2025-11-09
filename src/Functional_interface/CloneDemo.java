package Functional_interface;

class Prototype implements Cloneable {
    String model = "Prototype-1";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Original: " + p1.model + " | Cloned: " + p2.model);
    }
}