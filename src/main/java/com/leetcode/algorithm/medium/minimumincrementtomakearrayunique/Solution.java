package com.leetcode.algorithm.medium.minimumincrementtomakearrayunique;

import java.util.Arrays;

class Solution {
  public int minIncrementForUnique(int[] nums) {
    Arrays.sort(nums);
    int res = 0;
    int need = 0;
    for (int n: nums) {
      res += Math.max(need - n, 0);
      need = Math.max(n, need) + 1;
    }
    return res;
  }
}
