package com.insightfullogic.java8.examples.chapter8.observer;

// BEGIN Nasa
@SuppressWarnings("javadoc")
public class Nasa implements LandingObserver {

  @Override
  public void observeLanding(String name) {
    if (name.contains("Apollo")) {
      System.out.println("We made it!");
    }
  }
}
// END Nasa
