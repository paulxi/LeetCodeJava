package com.leetcode.algorithm.common;

import java.util.Arrays;
import java.util.List;

public class NestedIntegerList implements NestedInteger {
  private List<NestedInteger> list;

  public NestedIntegerList(NestedInteger... items) {
    this.list = Arrays.asList(items);
  }

  public boolean isInteger() {
    return false;
  }

  public Integer getInteger() {
    return null;
  }

  public List<NestedInteger> getList() {
    return this.list;
  }
}
