package com.leetcode.algorithm.common;

import java.util.function.Supplier;

public class SolBase {
  public Supplier<Integer> rand7Supplier;

  public int rand7() {
    return rand7Supplier.get();
  }
}
