package com.leetcode.algorithm.medium.summaryranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> summaryRanges(int[] nums) {
    ArrayList<String> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    }

    if (nums.length == 1) {
      result.add(Integer.toString(nums[0]));
      return result;
    }

    int start = 0;
    int end = 0;
    while (end < nums.length) {
      end += 1;
      if (end == nums.length || nums[end] > 1 + nums[end - 1]) {
        if (start == end - 1) {
          result.add(Integer.toString(nums[start]));
        } else {
          result.add(nums[start] + "->" + nums[end - 1]);
        }
        start = end;
      }
    }

    return result;
  }
}
