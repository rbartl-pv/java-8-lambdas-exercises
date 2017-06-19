package com.insightfullogic.java8.answers.chapter4;

import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Artist;

/** A Performance by some musicians - e.g., an Album or Gig. */
public interface Performance {

  /**
   * @return name of the performance
   */
  public String getName();

  /**
   * @return a stream of artists
   */
  public Stream<Artist> getMusicians();

}
