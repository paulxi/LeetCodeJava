package com.leetcode.algorithm.easy.firstbadversion;

import com.leetcode.algorithm.common.VersionControl;

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int lo = 0;
    int hi = n;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      boolean result = isBadVersion(mid);
      if (result) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    return lo;
  }
}
