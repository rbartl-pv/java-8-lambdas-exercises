/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.insightfullogic.java8.examples.chapter1;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Domain class for a popular music artist.
 * @author Richard Warburton
 */
public final class Artist {

  private String name;
  private List<Artist> members;
  private String nationality;

  /**
   * @param name name of the artist
   * @param nationality nationality of the artist
   */
  public Artist(String name, String nationality) {
    this(name, Collections.emptyList(), nationality);
  }

  /**
   * @param name name of the artist
   * @param members artist members (if the artist is e.g. a group)
   * @param nationality nationality of the artist
   */
  public Artist(String name, List<Artist> members, String nationality) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(members);
    Objects.requireNonNull(nationality);
    this.name = name;
    this.members = new ArrayList<>(members);
    this.nationality = nationality;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the members
   */
  public Stream<Artist> getMembers() {
    return members.stream();
  }

  /**
   * @return the nationality
   */
  public String getNationality() {
    return nationality;
  }

  /**
   * @return true if there are no members attached to this artist
   */
  public boolean isSolo() {
    return members.isEmpty();
  }

  /**
   * @param pNationality nationality
   * @return true if the passed nationality equals to the one of the artist
   */
  public boolean isFrom(String pNationality) {
    return this.nationality.equals(pNationality);
  }

  @Override
  public String toString() {
    return getName();
  }

  /**
   * @return a deep copy of the artist
   */
  public Artist copy() {
    List<Artist> membersTmp = getMembers().map(Artist::copy).collect(toList());
    return new Artist(name, membersTmp, nationality);
  }

}
