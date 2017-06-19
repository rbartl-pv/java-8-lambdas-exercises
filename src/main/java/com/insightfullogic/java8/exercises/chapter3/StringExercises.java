package com.insightfullogic.java8.exercises.chapter3;

import java.util.List;
import java.util.Optional;

import com.insightfullogic.java8.exercises.Exercises;

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
  public static Optional<String> mostLowercaseString(List<String> strings) {
    return Exercises.replaceThisWithSolution();
  }

}
