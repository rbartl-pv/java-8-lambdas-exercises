package com.insightfullogic.java8.examples.chapter1;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Sample data for all chapters
 */
public class SampleData {

  /** sample artist */
  public static final Artist johnColtrane = new Artist("John Coltrane", "US");

  /** sample artist */
  public static final Artist johnLennon = new Artist("John Lennon", "UK");
  /** sample artist */
  public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
  /** sample artist */
  public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
  /** sample artist */
  public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");

  /** sample list of artists */
  public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);

  /** sample artist */
  public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");

  /** sample album */
  public static final Album aLoveSupreme = new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)),
      asList(johnColtrane));

  /** sample album */
  public static final Album sampleShortAlbum = new Album("sample Short Album", asList(new Track("short track", 30)), asList(johnColtrane));

  /** sample album */
  public static final Album manyTrackAlbum = new Album("sample Short Album", asList(new Track("short track", 30), new Track("short track 2", 30),
      new Track("short track 3", 30), new Track("short track 4", 30), new Track("short track 5", 30)), asList(johnColtrane));

  /** sample albums as a stream */
  public static Stream<Album> albums = Stream.of(aLoveSupreme);

  /**
   * @return three artists as a stream
   */
  public static Stream<Artist> threeArtists() {
    return Stream.of(johnColtrane, johnLennon, theBeatles);
  }

  /**
   * @return three artists as a list
   */
  public static List<Artist> getThreeArtists() {
    return Arrays.asList(johnColtrane, johnLennon, theBeatles);
  }

}
