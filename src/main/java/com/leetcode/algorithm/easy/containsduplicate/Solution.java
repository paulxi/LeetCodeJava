package com.leetcode.algorithm.easy.containsduplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num: nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }

    return false;
  }
}
