package com.leetcode.algorithm.common;

import java.util.List;
import java.util.Objects;

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

  public void add(NestedInteger ni) { }

  public List<NestedInteger> getList() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NestedIntegerInteger)) {
      return false;
    }
    NestedIntegerInteger that = (NestedIntegerInteger) o;
    return integer.equals(that.integer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer);
  }
}
