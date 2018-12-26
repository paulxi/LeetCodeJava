package com.leetcode.algorithm.common;

import java.util.function.ToIntFunction;

public class Reader4 {
  public ToIntFunction<char[]> function;

  protected int read4(char[] buf) {
    return function.applyAsInt(buf);
  }
}
