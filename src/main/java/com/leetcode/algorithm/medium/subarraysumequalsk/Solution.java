package com.leetcode.algorithm.medium.subarraysumequalsk;

import java.util.HashMap;

class Solution {
//  public int subarraySum(int[] nums, int k) {
//    int[] sums = new int[nums.length + 1];
//    sums[0] = 0;
//    for (int i = 1; i < sums.length; i++) {
//      sums[i] = sums[i - 1] + nums[i - 1];
//    }
//
//    int count = 0;
//    for (int i = 0; i < sums.length; i++) {
//      for (int j = i + 1; j < sums.length; j++) {
//        if (sums[j] - sums[i] == k) {
//          count++;
//        }
//      }
//    }
//
//    return count;
//  }

  public int subarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int count = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
  }
}
