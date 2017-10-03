package com.insightfullogic.java8.answers.chapter3;

import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Artist;

/**
 * Chapter 3, p.38, Question 2, Answer
 */
public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
        // NB: readers haven't learnt about primitives yet, so can't use the sum() method
        return artists.stream()
                       .map(artist -> artist.getMembers().count())
                       .reduce(0L, Long::sum)
                       .intValue();
        
        //return (int) artists.stream().flatMap(artist -> artist.getMembers()).count();
    }
}
