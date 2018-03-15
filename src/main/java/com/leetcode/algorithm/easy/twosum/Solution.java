package com.leetcode.algorithm.easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  /**
   * Given an array of integers, return indices of the two numbers such that they add up to
   * a specific target.
   * @param nums an array of integers
   * @param target a specific target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      int item = nums[index];
      int value = target - item;
      Integer valueIndex = map.get(value);
      if (valueIndex != null) {
        return new int[]{valueIndex.intValue(), index};
      }
      map.put(item, index);
    }
    return new int[0];
  }
}
