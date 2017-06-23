package com.insightfullogic.java8.examples.chapter8.command;

// BEGIN Save
@SuppressWarnings("javadoc")
public class Save implements Action {

  private final Editor editor;

  public Save(Editor editor) {
    this.editor = editor;
  }

  @Override
  public void perform() {
    editor.save();
  }
}
// END Save
