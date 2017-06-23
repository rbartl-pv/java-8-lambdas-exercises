package com.insightfullogic.java8.exercises.chapter4;

import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Artist;

/** A Performance by some musicians - e.g., an Album or Gig. */
@SuppressWarnings("javadoc")
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

}