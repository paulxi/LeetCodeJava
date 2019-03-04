package com.leetcode.algorithm.medium.containsduplicateiii;

import java.util.TreeSet;

class Solution {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < nums.length; i++) {
      Integer s = set.ceiling(nums[i]);
      if (s != null && s <= nums[i] + t) {
        return true;
      }

      Integer p = set.floor(nums[i]);
      if (p != null && nums[i] <= p + t) {
        return true;
      }

      set.add(nums[i]);
      if (set.size() > k) {
        set.remove(nums[i - k]);
      }
    }

    return false;
  }
}
