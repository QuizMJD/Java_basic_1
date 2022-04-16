package com.qui.animal;

public class Main {
  public static void main(String[] args) {
    // Declaring animal and dog objects:
    Animal animal = new Animal();
    Dog dog = new Dog();

    // Print animal's name and call sayHello() method:
    // Print animal's name using "name" field:
    System.out.println("Animal field value: " + animal.name + ".");
    // Print animal's name using getter method:
    System.out.println("Animal value from getter method: " + animal.getName() + ".");
    animal.sayHello();
    animal.setName("Scooby-Doo");
    System.out.println(animal.getName());
    animal.sayHello();

    // Print dog's name and call sayHello() method:
    System.out.println(dog.getName());
    dog.sayHello();
    dog.setName("Lu");
    System.out.println(dog.getName());
    dog.sayHello();

    Animal lulu = new Animal("Lulu");
    System.out.println(lulu.getName());
    lulu.sayHello();
  }
}