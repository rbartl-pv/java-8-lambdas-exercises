package com.insightfullogic.java8.exercises.chapter4;

import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

/** A Performance by some musicians - eg an Album or Gig. */
@SuppressWarnings("javadoc")
public interface PerformanceFixed {

  public String getName();

  public Stream<Artist> getMusicians();

  public default Stream<Artist> getAllMusicians() {
    return Exercises.replaceThisWithSolution();
  }

}
