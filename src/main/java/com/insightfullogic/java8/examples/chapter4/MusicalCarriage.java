package com.insightfullogic.java8.examples.chapter4;

// BEGIN body
@SuppressWarnings("javadoc")
public class MusicalCarriage
    implements Carriage, Jukebox {

  @Override
  public String rock() {
    return Carriage.super.rock();
  }

}
// END body
