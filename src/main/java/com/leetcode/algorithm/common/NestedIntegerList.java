package com.leetcode.algorithm.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NestedIntegerList implements NestedInteger {
  private List<NestedInteger> list;

  public NestedIntegerList(NestedInteger... items) {
    this.list = new ArrayList();
    for (NestedInteger item: items) {
      this.list.add(item);
    }
  }

  public boolean isInteger() {
    return false;
  }

  public Integer getInteger() {
    return null;
  }

  public void add(NestedInteger ni) {
    this.list.add(ni);
  }

  public List<NestedInteger> getList() {
    return this.list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NestedIntegerList)) {
      return false;
    }
    NestedIntegerList that = (NestedIntegerList) o;
    return list.equals(that.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }
}
