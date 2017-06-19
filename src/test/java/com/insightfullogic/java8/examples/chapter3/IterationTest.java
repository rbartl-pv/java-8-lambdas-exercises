package com.insightfullogic.java8.examples.chapter3;

import org.junit.Test;

import com.insightfullogic.java8.examples.chapter1.SampleData;

@SuppressWarnings("javadoc")
public class IterationTest {

    @Test
    public void lazyPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.filterArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }

    @Test
    public void evaluatedPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.internalCountArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }
}
