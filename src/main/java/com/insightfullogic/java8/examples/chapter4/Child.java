package com.insightfullogic.java8.examples.chapter4;

// BEGIN body
@SuppressWarnings("javadoc")
public interface Child extends Parent {

  @Override
  public default void welcome() {
    message("Child: Hi!");
  }

}
// END body
