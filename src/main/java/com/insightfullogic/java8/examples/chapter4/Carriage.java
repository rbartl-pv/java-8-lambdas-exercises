package com.insightfullogic.java8.examples.chapter4;

// BEGIN body
@SuppressWarnings("javadoc")
public interface Carriage {

  public default String rock() {
    return "... from side to side";
  }

}
// END body
