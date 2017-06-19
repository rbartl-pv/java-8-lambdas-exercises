package com.insightfullogic.java8.answers.chapter5;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;
import java.util.stream.Stream;

@SuppressWarnings("javadoc")
public class WordCount {

  public static Map<String, Long> countWords(Stream<String> names) {
    return names.collect(groupingBy(name -> name, counting()));
  }

}
