package com.qui.animal;

// Dog class:
public class Dog extends Animal {
  // Method overriding: ghi đè method có cùng tên của class cha.
  // Method overloading: nhiều methods có cùng tên nhưng khác parameters.

  // FIELDS:
  private String name = "Dog";

  // CONSTRUCTORS:
  // Default constructor:
  public Dog() {}

  // Constructor with parameters:
  public Dog(String name) {
    this.name = name;
  }

  // METHODS:
  // Getters & Setters:
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Public methods:
  public void sayHello() {
    System.out.println("Hello! I am " + this.name + ".");
  }
}