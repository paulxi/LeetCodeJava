package com.leetcode.algorithm.medium.kokoeatingbananas;

class Solution {
  public int minEatingSpeed(int[] piles, int hour) {
    int lo = 1;
    int hi = 1000000000;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int total = 0;
      for (int p: piles) {
        total += (p + mid - 1) / mid;
      }
      if (total > hour) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo;
  }
}
