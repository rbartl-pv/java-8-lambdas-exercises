package com.insightfullogic.java8.examples.chapter3;

import java.util.Iterator;
import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Artist;

/**
 * example class for illustrative purpose of iterations with lambda expressions and without
 */
public class Iteration {

  /**
   * @param allArtists a list of artists
   * @return the number of artists from London
   */
  public int externalCountArtistsFromLondon(List<Artist> allArtists) {
    // BEGIN external_count_londoners
    int count = 0;
    for (Artist artist : allArtists) {
      if (artist.isFrom("London")) {
        count++;
      }
    }
    // END external_count_londoners
    return count;
  }

  /**
   * @param allArtists a list of artists
   * @return the number of artists from London
   */
  public int externalCountArtistsFromLondonExpanded(List<Artist> allArtists) {
    // BEGIN external_count_londoners_expanded
    int count = 0;
    Iterator<Artist> iterator = allArtists.iterator();
    while (iterator.hasNext()) {
      Artist artist = iterator.next();
      if (artist.isFrom("London")) {
        count++;
      }
    }
    // END external_count_londoners_expanded
    return count;
  }

  /**
   * @param allArtists a list of artists
   * @return the number of artists from London
   */
  public long internalCountArtistsFromLondon(List<Artist> allArtists) {
    // BEGIN internal_count_londoners
    long count = allArtists.stream().filter(artist -> artist.isFrom("London")).count();
    // END internal_count_londoners
    return count;
  }

  /**
   * Retains only the artists from London
   * @param allArtists a list of artists
   */
  public void filterArtistsFromLondon(List<Artist> allArtists) {
    // BEGIN filter_londoners
    allArtists.stream().filter(artist -> artist.isFrom("London"));
    // END filter_londoners
  }

  /**
   * Retains only the artists from London
   * @param allArtists a list of artists
   */
  public void filterArtistsFromLondonPrinted(List<Artist> allArtists) {
    // BEGIN filter_londoners_printed
    allArtists.stream().filter(artist -> {
      System.out.println(artist.getName());
      return artist.isFrom("London");
    });
    // END filter_londoners_printed
  }

  /**
   * @param allArtists a list of artists
   * @return the number of artists from London
   */
  public long internalCountArtistsFromLondonPrinted(List<Artist> allArtists) {
    // BEGIN internal_count_londoners_printed
    long count = allArtists.stream().filter(artist -> {
      System.out.println(artist.getName());
      return artist.isFrom("London");
    }).count();
    // END internal_count_londoners_printed
    return count;
  }

}
