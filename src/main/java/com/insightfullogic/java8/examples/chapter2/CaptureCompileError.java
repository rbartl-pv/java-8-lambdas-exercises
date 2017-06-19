package com.insightfullogic.java8.examples.chapter2;

import javax.swing.JButton;

/**
 * dummy class for illustrating purpose
 */
public class CaptureCompileError {

  @SuppressWarnings("unused")
  private JButton button;

  /**
   * throws an error of some code is uncommented
   */
  public void error() {
    String name = getUserName();
    name = formatUserName(name);
    // Uncommenting this line should cause a compile error:
    // button.addActionListener(event -> System.out.println("hi " + name));
  }

  private String formatUserName(String name) {
    return name.toLowerCase();
  }

  private String getUserName() {
    return "RICHARD";
  }
}
