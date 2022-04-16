package com.qui.animal;

// Animal class:
/* How to declare a Java class: access modifier + "class" keyword + class name + {} */
public class Animal {
  // FIELDS:
  protected String name = "Animal";

  // CONSTRUCTORS:
  // Default constructor:
  public Animal() {}

  // Constructor with parameters:
  public Animal(String name) {
    this.name = name;
  }

  // METHODS:
  /* How to declare a Java method: access modifier + return data type + method name + (method parameters) + {} */
  // Getters & Setters:
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Public methods:
  protected void sayHello() {
    System.out.println("Hello! I am " + this.name + ".");
  }
}