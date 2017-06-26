package com.insightfullogic.java8.examples.chapter4;

// BEGIN body
@SuppressWarnings("javadoc")
public class OverridingParent extends ParentImpl {

  @Override
  public void welcome() {
    message("Class Parent: Hi!");
  }

}
// END body
