package com.leetcode.algorithm.common;

import java.util.function.Function;

public class ArrayReader {
  public Function<Integer, Integer> function;

  public int get(int num) {
    return function.apply(num);
  }
}
