/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.insightfullogic.java8.examples.chapter1;

import static java.util.Collections.unmodifiableList;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author richard
 */
public final class Album implements Performance {

  private String name;
  private List<Track> tracks;
  private List<Artist> musicians;

  /**
   * @param name name of the album
   * @param tracks list of tracks on the album
   * @param musicians list of musicians who perform the album
   */
  public Album(String name, List<Track> tracks, List<Artist> musicians) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(tracks);
    Objects.requireNonNull(musicians);

    this.name = name;
    this.tracks = new ArrayList<>(tracks);
    this.musicians = new ArrayList<>(musicians);
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the tracks
   */
  public Stream<Track> getTracks() {
    return tracks.stream();
  }

  /**
   * Used in imperative code examples that need to iterate over a list
   * @return a list with the tracks
   */
  public List<Track> getTrackList() {
    return unmodifiableList(tracks);
  }

  /**
   * @return the musicians
   */
  public Stream<Artist> getMusicians() {
    return musicians.stream();
  }

  /**
   * Used in imperative code examples that need to iterate over a list
   * @return a list with the artists
   */
  public List<Artist> getMusicianList() {
    return unmodifiableList(musicians);
  }

  /**
   * @return the main musician
   */
  public Artist getMainMusician() {
    return musicians.get(0);
  }

  /**
   * @return a deep copy of this album
   */
  public Album copy() {
    List<Track> tracksTmp = getTracks().map(Track::copy).collect(toList());
    List<Artist> musiciansTmp = getMusicians().map(Artist::copy).collect(toList());
    return new Album(name, tracksTmp, musiciansTmp);
  }

}
