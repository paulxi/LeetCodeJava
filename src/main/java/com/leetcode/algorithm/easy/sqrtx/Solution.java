package com.leetcode.algorithm.easy.sqrtx;

class Solution {
  public int mySqrt(int x) {
    if (x <= 1) {
      return x;
    }
    int low = 1;
    int high = x;
    while (low < high) {
      int mid = low + (high - low) / 2;

      if (mid <= x / mid) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }

    return high - 1;
  }
}
