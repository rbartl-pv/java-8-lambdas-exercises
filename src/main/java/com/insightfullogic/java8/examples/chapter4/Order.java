package com.insightfullogic.java8.examples.chapter4;


import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Album;

@SuppressWarnings("javadoc")
public abstract class Order {

  protected final List<Album> albums;

  public Order(List<Album> albums) {
    this.albums = albums;
  }

  public abstract long countRunningTime();

  public abstract long countMusicians();

  public abstract long countTracks();

}
