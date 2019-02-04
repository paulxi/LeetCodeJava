package com.leetcode.algorithm.common;

import java.util.function.Predicate;

public class VersionControl {
  public Predicate<Integer> predicate;

  public boolean isBadVersion(int version) {
    return predicate.test(version);
  }
}
