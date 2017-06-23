package com.insightfullogic.java8.exercises.chapter9;

import java.util.function.Consumer;

// BEGIN class
@SuppressWarnings("javadoc")
public interface ArtistAnalyzer {

  public void isLargerGroup(String artistName,
      String otherArtistName,
      Consumer<Boolean> handler);

}
// END class
