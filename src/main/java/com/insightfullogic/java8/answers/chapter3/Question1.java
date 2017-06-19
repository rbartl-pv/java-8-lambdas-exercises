package com.insightfullogic.java8.answers.chapter3;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

/**
 * Chapter 3, p.37-38, Question 1, Answers
 */
public class Question1 {

  /**
   * A function that adds up numbers
   * @param numbers stream of integers
   * @return the sum as an integer
   */
  public static int addUp(Stream<Integer> numbers) {
    return numbers.reduce(0, (acc, x) -> acc + x);
  }

  /**
   * A function that takes in artists and returns a list of strings with their names and places of origin
   * @param artists list of artists
   * @return a list with artist names and nationalities
   */
  public static List<String> getNamesAndOrigins(List<Artist> artists) {
    return artists.stream()
        .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
        .collect(toList());
  }

  /**
   * A function that takes in albums and returns a list of albums with at most three tracks
   * @param input list of albums
   * @return a list of albums with at most three tracks
   */
  public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
    return input.stream()
        .filter(album -> album.getTrackList().size() <= 3)
        .collect(toList());
  }
}
