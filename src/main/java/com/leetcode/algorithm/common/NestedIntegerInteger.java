package com.leetcode.algorithm.common;

import java.util.List;

public class NestedIntegerInteger implements NestedInteger {
  private Integer integer;

  public NestedIntegerInteger(Integer integer) {
    this.integer = integer;
  }

  public boolean isInteger() {
    return true;
  }

  public Integer getInteger() {
    return this.integer;
  }

  public List<NestedInteger> getList() {
    return null;
  }
}
