package com.leetcode.algorithm.medium.missingranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> ans = new ArrayList<>();
    long next = lower;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < next) {
        continue;
      }

      if (nums[i] == next) {
        next++;
        continue;
      }

      ans.add(getRange(next, nums[i] - 1));
      next = (long)nums[i] + 1;
    }

    if (next <= upper) {
      ans.add(getRange(next, upper));
    }

    return ans;
  }

  private String getRange(long n1, long n2) {
    return (n1 == n2) ? String.valueOf(n1) : n1 + "->" + n2;
  }
}
