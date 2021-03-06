package com.insightfullogic.java8.exercises.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 1: Write an implementation of the Stream function map using only reduce and lambda expressions. You can
 * return a List instead of a Stream if you want.
 */
public class MapUsingReduce {

  /**
   * @param stream stream of I
   * @param mapper mapper function with input I and result O
   * @return list of O
   */
  public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
    return stream.reduce(new ArrayList<O>(), (acc, x) -> {
      // We are copying data from acc to new list instance. It is very inefficient,
      // but contract of Stream.reduce method requires that accumulator function does
      // not mutate its arguments.
      // Stream.collect method could be used to implement more efficient mutable reduction,
      // but this exercise asks to use reduce method.
      List<O> newAcc = new ArrayList<>(acc);
      System.out.println("Original List: " + newAcc);
      newAcc.add(mapper.apply(x));
      System.out.println("List after mapping: " + newAcc);
      return newAcc;
    }, (List<O> left, List<O> right) -> {
      System.out.println("List Left: " + left);
      // We are copying left to new list to avoid mutating it.
      List<O> newLeft = new ArrayList<>(left);
      newLeft.addAll(right);
      System.out.println("List newLeft: " + left);
      return newLeft;
    });
  }

}
