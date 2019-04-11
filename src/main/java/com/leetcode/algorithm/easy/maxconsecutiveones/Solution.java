package com.leetcode.algorithm.easy.maxconsecutiveones;


class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int pos = -1;
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        pos = i;
      }

      ans = Math.max(ans, i - pos);
    }

    return ans;
  }
}
