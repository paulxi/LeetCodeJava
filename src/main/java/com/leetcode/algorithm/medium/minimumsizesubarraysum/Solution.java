package com.leetcode.algorithm.medium.minimumsizesubarraysum;

class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int ans = Integer.MAX_VALUE;
    int sum = 0;
    int left = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      while (sum >= s) {
        ans = Math.min(ans, i - left + 1);
        sum -= nums[left];
        left++;
      }
    }

    return ans == Integer.MAX_VALUE ? 0 : ans;
  }
}
