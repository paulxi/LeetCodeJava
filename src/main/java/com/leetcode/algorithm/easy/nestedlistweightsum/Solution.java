package com.leetcode.algorithm.easy.nestedlistweightsum;

import com.leetcode.algorithm.common.NestedInteger;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int depthSum(List<NestedInteger> nestedList) {
    return depthSum(nestedList, 0, 1);
  }

  private int depthSum(List<NestedInteger> nestedList, int sum, int depth) {
    if (nestedList.size() == 0) {
      return sum;
    }

    List<NestedInteger> next = new ArrayList<>();
    for (NestedInteger nestedInteger: nestedList) {
      if (nestedInteger.isInteger()) {
        sum += (nestedInteger.getInteger() * depth);
      } else {
        next.addAll(nestedInteger.getList());
      }
    }

    return depthSum(next, sum, depth + 1);
  }
}
