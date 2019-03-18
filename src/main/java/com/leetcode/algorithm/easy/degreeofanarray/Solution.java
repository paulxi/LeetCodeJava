package com.leetcode.algorithm.easy.degreeofanarray;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int findShortestSubArray(int[] nums) {
    Map<Integer, Integer> count = new HashMap<>();
    Map<Integer, Integer> leftIndex = new HashMap<>();
    Map<Integer, Integer> rightIndex = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
      if (!leftIndex.containsKey(nums[i])) {
        leftIndex.put(nums[i], i);
      }

      rightIndex.put(nums[i], i);
    }

    int degree = Collections.max(count.values());
    int ans = nums.length;
    for (int n: count.keySet()) {
      if (count.get(n) == degree) {
        ans = Math.min(ans, rightIndex.get(n) - leftIndex.get(n) + 1);
      }
    }

    return ans;
  }
}
