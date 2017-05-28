package com.insightfullogic.java8.exercises.chapter3;

import java.util.List;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

public class Question1 {
    public static int addUp(Stream<Integer> numbers) {
	return numbers.reduce(0, (acc, x) -> acc + x);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
	return Exercises.replaceThisWithSolution();
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
	return Exercises.replaceThisWithSolution();
    }
}
