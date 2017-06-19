/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.insightfullogic.java8.examples.chapter1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author richard
 */
public class Chapter1 extends MusicChapter {

  /**
   * @return a list with the names of the artists
   */
  public List<String> getNamesOfArtists_Lambda() {
    return artists.stream()
        .map(artist -> artist.getName())
        .collect(Collectors.toList());
  }

  /**
   * @return a list with the names of the artists
   */
  public List<String> getNamesOfArtists_MethodReference() {
    return artists.stream()
        .map(Artist::getName)
        .collect(Collectors.toList());
  }

  /**
   * @return a list of artists living in London
   */
  public List<Artist> artistsLivingInLondon() {
    return artists.stream()
        .filter(artist -> "London".equals(artist.getNationality()))
        .collect(Collectors.toList());
  }

}
