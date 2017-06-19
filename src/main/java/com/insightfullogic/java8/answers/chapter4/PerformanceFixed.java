package com.insightfullogic.java8.answers.chapter4;

import static java.util.stream.Stream.concat;

import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Artist;

/** A Performance by some musicians - eg an Album or Gig. */
public interface PerformanceFixed {

  /**
   * @return name of the performance
   */
  public String getName();

  /**
   * @return a stream of artists
   */
  public Stream<Artist> getMusicians();

  /**
   * @return a stream of artists
   */
  public default Stream<Artist> getAllMusicians() {
    return getMusicians()
        .flatMap(artist -> concat(Stream.of(artist), artist.getMembers()));
  }

}
