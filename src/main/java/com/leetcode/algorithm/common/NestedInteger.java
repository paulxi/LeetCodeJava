package com.leetcode.algorithm.common;

import java.util.List;

public interface NestedInteger {
  boolean isInteger();
  Integer getInteger();
  void add(NestedInteger ni);
  List<NestedInteger> getList();
}
