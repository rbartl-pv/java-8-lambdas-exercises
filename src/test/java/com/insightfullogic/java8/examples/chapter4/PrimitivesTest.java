package com.insightfullogic.java8.examples.chapter4;

import org.junit.Test;

import com.insightfullogic.java8.examples.chapter1.SampleData;

@SuppressWarnings("javadoc")
public class PrimitivesTest {

    @Test
    public void albumStatistics() {
        Primitives.printTrackLengthStatistics(SampleData.aLoveSupreme);
    }

}
