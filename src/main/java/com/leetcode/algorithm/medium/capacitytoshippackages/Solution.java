package com.leetcode.algorithm.medium.capacitytoshippackages;

class Solution {
  public int shipWithinDays(int[] weights, int d) {
    int left = 0;
    int right = 0;
    for (int w: weights) {
      left = Math.max(left, w);
      right += w;
    }

    while (left < right) {
      int mid = (left + right) / 2;
      int need = 1;
      int cur = 0;

      for (int w: weights) {
        if (cur + w > mid) {
          need += 1;
          cur = 0;
        }
        cur += w;
      }

      if (need > d) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }
}
