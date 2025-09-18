package Inheritance.Assisted_Problems;
import java.util.Scanner;
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Chirp! Chirp!");
    }
}
class Animal_Hierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal type (dog/cat/bird): ");
        String choice = sc.nextLine().toLowerCase();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Animal animal;
        if (choice.equals("dog"))
        {
            animal = new Dog(name, age);
        }
        else if (choice.equals("cat"))
        {
            animal = new Cat(name, age);
        }
        else if (choice.equals("bird"))
        {
            animal = new Bird(name, age);
        }
        else
        {
            animal = new Animal(name, age);
        }
        System.out.println("Animal: " + animal.name + ", Age: " + animal.age);
        animal.makeSound();
        sc.close();
    }
}
