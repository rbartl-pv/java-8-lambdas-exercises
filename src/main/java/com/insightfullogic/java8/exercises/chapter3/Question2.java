package com.insightfullogic.java8.exercises.chapter3;

import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Artist;

/**
 * Chapter 3, p.38, Question 2, Solution
 */
public class Question2 {

  /**
   * Example converting external into internal iteration
   * @param artists a list of artists
   * @return total number of band members
   */
  public static int countBandMembersInternal(List<Artist> artists) {
    return artists.stream()
        .map(artist -> artist.getMembers().count())
        .reduce(0L, Long::sum)
        .intValue();
  }

  // External iteration code:
  // int totalMembers = 0;
  // for (Artist artist : artists) {
  // Stream<Artist> members = artist.getMembers();
  // totalMembers += members.count();
  // }
}
