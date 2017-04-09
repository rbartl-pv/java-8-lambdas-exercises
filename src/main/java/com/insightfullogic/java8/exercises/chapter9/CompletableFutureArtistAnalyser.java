package com.insightfullogic.java8.exercises.chapter9;

import java.util.function.Consumer;
import java.util.function.Function;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

public class CompletableFutureArtistAnalyser implements ArtistAnalyzer {

    @SuppressWarnings("unused")
	private final Function<String, Artist> artistLookupService;

    public CompletableFutureArtistAnalyser(Function<String, Artist> artistLookupService) {
        this.artistLookupService = artistLookupService;
    }

    public void isLargerGroup(String artistName, String otherArtistName, Consumer<Boolean> handler) {
        Exercises.replaceThisWithSolution();
    }

    @SuppressWarnings("unused")
	private long getNumberOfMembers(String artistName) {
        return Exercises.replaceThisWithSolution();
    }

}
