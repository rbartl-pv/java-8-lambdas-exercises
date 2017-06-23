package com.insightfullogic.java8.exercises.chapter6;

import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class SerialToParallelTest {

  @Test
  public void testSerialToParallel() {
    IntStream range = IntStream.range(0, 100);
    assertEquals(328350, SerialToParallel.sumOfSquares(range));
  }

}
