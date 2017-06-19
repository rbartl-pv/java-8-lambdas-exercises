package com.insightfullogic.java8.examples.chapter1;

import static java.util.stream.Stream.concat;

import java.util.stream.Stream;

/**
 * interface describing a performance
 */
public interface Performance {


  /**
   * @return the name of the performance
   */
  public String getName();

  /**
   * @return the artists as a stream
   */
  public Stream<Artist> getMusicians();

  /**
   * @return the artists as a stream
   */
  public default Stream<Artist> getAllMusicians() {
    return getMusicians().flatMap(artist -> {
      return concat(Stream.of(artist), artist.getMembers());
    });
  }

}
