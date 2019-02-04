package com.leetcode.algorithm.common;

import java.util.function.Function;

public class GuessGame {
  public Function<Integer, Integer> function;

  public int guess(int n) {
    return function.apply(n);
  }
}
