package com.insightfullogic.java8.examples.chapter3;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * example class for illustrative purpose
 */
public class Functional {

  private JButton button = new JButton();

  // BEGIN field_assignment
  @SuppressWarnings("unused")
  private ActionEvent lastEvent;

  @SuppressWarnings("unused")
  private void registerHandler() {
    button.addActionListener((
        ActionEvent event) -> {
      this.lastEvent = event;
    });
  }
  // END field_assignment

}
