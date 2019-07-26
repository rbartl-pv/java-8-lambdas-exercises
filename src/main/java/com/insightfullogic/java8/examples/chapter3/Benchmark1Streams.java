package com.insightfullogic.java8.examples.chapter3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.RunnerException;

@SuppressWarnings("javadoc")
@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
public class Benchmark1Streams {

  private static final int SIZE = 100000;
  private final List<User> userList = createUsers(SIZE);

  private static final Random RANDOM = new Random();
  private static final String[] LETTERS = { "a", "b", "c", "d", "e", "f", "g", "h", "i" };

  private List<User> createUsers(int size) {
    List<User> users = new ArrayList<User>(size);
    for (int i = 0; i < size; i++) {
      StringBuilder username = new StringBuilder();
      for (int j = 0; j < 1 + RANDOM.nextInt(20); j++) {
        username.append(LETTERS[RANDOM.nextInt(9)]);
      }
      users.add(new User(username.toString(), RANDOM.nextInt(80) + 20));
    }
    return users;
  }

  @Benchmark
  public Integer executeReduceOnParallelizedStream() {
    return this.userList.parallelStream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
  }

  @Benchmark
  public Integer executeReduceOnSequentialStream() {
    return this.userList.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
  }

  public static void main(String[] ignore) throws IOException, RunnerException {
    Main.main(ignore);
  }

}
