package com.leetcode.algorithm.hard.findkthsmallestpairdistance;

import java.util.Arrays;

class Solution {
  public int smallestDistancePair(int[] nums, int k) {
    Arrays.sort(nums);

    int lo = 0;
    int hi = nums[nums.length - 1] - nums[0];

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int count = 0;
      int left = 0;
      for (int right = 0; right < nums.length; right++) {
        while (nums[right] - nums[left] > mid) {
          left++;
        }
        count += right - left;
      }

      if (count >= k) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }
    return lo;
  }
}
