package com.insightfullogic.java8.exercises.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Chapter 3, p.38, Questions 6/7, Solution
 */
public class StringExercises {

  // Question 6
  /**
   * Count the number of lowercase letters in a String
   * @param string
   * @return number of lowercase letters in passed string
   */
  public static int countLowercaseLetters(String string) {
    return (int)string.chars()
        .filter(Character::isLowerCase)
        .count();
  }

  // Question 7
  /**
   * Find the String with the largest number of lowercase letters from a List<String>. You can return an Optional<String> to account for the empty listcase.
   * @param strings list of strings
   * @return the String with the largest number of lowercase letters
   */
  public static Optional<String> mostLowercaseString(List<String> strings) {
    return strings.stream().max(Comparator.comparing(StringExercises::countLowercaseLetters));
  }

}
