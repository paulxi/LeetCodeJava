package com.leetcode.algorithm.medium.nestedlistweightsumii;

import com.leetcode.algorithm.common.NestedInteger;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int depthSumInverse(List<NestedInteger> nestedList) {
    int unweighted = 0, weighted = 0;
    while (!nestedList.isEmpty()) {
      List<NestedInteger> nextLevel = new ArrayList<>();
      for (NestedInteger ni : nestedList) {
        if (ni.isInteger()) {
          unweighted += ni.getInteger();
        } else {
          nextLevel.addAll(ni.getList());
        }
      }
      weighted += unweighted;
      nestedList = nextLevel;
    }
    return weighted;
  }
}
