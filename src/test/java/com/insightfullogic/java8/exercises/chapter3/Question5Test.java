/* Copyright (c) pro!vision GmbH. All rights reserved. */
package com.insightfullogic.java8.exercises.chapter3;

import static com.insightfullogic.java8.exercises.chapter3.Question5.sideffect;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.insightfullogic.java8.examples.chapter1.SampleData;

@SuppressWarnings("javadoc")
public class Question5Test {

  @Test
  public void internal() {
    assertNotEquals(0, sideffect(SampleData.manyTrackAlbum));
  }
}
