package com.insightfullogic.java8.answers.chapter3;

import static com.insightfullogic.java8.answers.chapter3.Question2.countBandMembersInternal;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.insightfullogic.java8.examples.chapter1.SampleData;

@SuppressWarnings("javadoc")
public class Question2Test {

    @Test
    public void internal() {
        assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

}
