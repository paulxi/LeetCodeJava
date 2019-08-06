package com.leetcode.algorithm.medium.summaryranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> summaryRanges(int[] nums) {
    int n = nums.length;
    List<String> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int num = nums[i];
      while (i < n - 1 && nums[i] + 1 == nums[i + 1]) {
        i++;
      }

      if (num != nums[i]) {
        ans.add(num + "->" + nums[i]);
      } else {
        ans.add("" + num);
      }
    }

    return ans;
  }
}
