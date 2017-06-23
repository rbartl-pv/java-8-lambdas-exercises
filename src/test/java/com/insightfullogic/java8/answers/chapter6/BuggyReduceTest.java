package com.insightfullogic.java8.answers.chapter6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class BuggyReduceTest {

  @Test
  public void sample() {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    int result = BuggyReduce.multiplyThrough(numbers);
    assertEquals(30, result);
  }

}
