package com.insightfullogic.java8.answers.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 2
 */
public class MapUsingReduce {

  @SuppressWarnings("javadoc")
  public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
    return stream.reduce(new ArrayList<O>(), (acc, x) -> newListWithMappedValues(acc, x, mapper),
        (List<O> left, List<O> right) -> concatLists(left, right));
  }

  private static <I, O> List<O> newListWithMappedValues(List<O> list, I x, Function<I, O> mapper) {
    // We are copying data from acc to new list instance. It is very inefficient,
    // but contract of Stream.reduce method requires that accumulator function does
    // not mutate its arguments.
    // Stream.collect method could be used to implement more efficient mutable reduction,
    // but this exercise asks to use reduce method.
    List<O> newAcc = new ArrayList<>(list);
    newAcc.add(mapper.apply(x));
    return newAcc;
  }

  private static <O> List<O> concatLists(List<O> left, List<O> right) {
    // We are copying left to new list to avoid mutating it.
    List<O> newLeft = new ArrayList<>(left);
    newLeft.addAll(right);
    return newLeft;
  }

}
