/* Copyright (c) pro!vision GmbH. All rights reserved. */
package com.insightfullogic.java8.exercises.chapter3;

import java.util.concurrent.atomic.AtomicInteger;

import com.insightfullogic.java8.examples.chapter1.Album;

/**
 * Chapter 3, p.38, Question 5, Solution for sideffect question
 */
public class Question5 {

  @SuppressWarnings("javadoc")
  public static int sideffect(Album album) {
    AtomicInteger count = new AtomicInteger(0);
    album.getMusicians()
        .forEach(musician -> count.incrementAndGet());
    return count.get();

  }

}
