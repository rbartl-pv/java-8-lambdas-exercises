package com.insightfullogic.java8.examples.chapter4;

@SuppressWarnings("javadoc")
public class ParentImpl implements Parent {

  private String body;

  @Override
  public void message(String pBody) {
    this.body = pBody;
  }

  @Override
  public String getLastMessage() {
    return body;
  }

}
