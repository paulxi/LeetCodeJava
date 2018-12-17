package com.leetcode.algorithm.common;

import java.util.function.BiPredicate;

public class Relation {
  public BiPredicate<Integer, Integer> predicate;

  protected boolean knows(int a, int b) {
    return predicate.test(a, b);
  }
}
