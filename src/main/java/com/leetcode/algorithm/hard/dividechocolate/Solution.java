package com.leetcode.algorithm.hard.dividechocolate;

class Solution {
  public int maximizeSweetness(int[] sweetness, int k) {
    int lo = 1;
    int hi = (int)1e9 / (k + 1);
    while (lo < hi) {
      int mid = lo + (hi - lo + 1) / 2;
      int cur = 0;
      int cuts = 0;
      for (int num: sweetness) {
        cur += num;
        if (cur >= mid) {
          cur = 0;
          cuts++;
          if (cuts > k) {
            break;
          }
        }
      }

      if (cuts > k) {
        lo = mid;
      } else {
        hi = mid - 1;
      }
    }

    return lo;
  }
}
