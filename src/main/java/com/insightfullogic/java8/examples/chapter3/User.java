package com.insightfullogic.java8.examples.chapter3;

@SuppressWarnings("javadoc")
public class User {
  private final String name;
  private final int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
