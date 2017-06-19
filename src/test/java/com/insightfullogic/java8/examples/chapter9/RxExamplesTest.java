package com.insightfullogic.java8.examples.chapter9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;

@SuppressWarnings("javadoc")
public class RxExamplesTest {

  @Test
  public void filtersAlbums() {
    RxExamples examples = new RxExamples(SampleData.getThreeArtists());
    Artist artist = examples.search("John", "UK", 5)
        .toBlockingObservable()
        .single();

    assertEquals(SampleData.johnLennon, artist);
  }

}
