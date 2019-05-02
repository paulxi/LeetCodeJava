package com.leetcode.algorithm.hard.kthsmallestnumberinmultiplicationtable;

class Solution {
  public int findKthNumber(int m, int n, int k) {
    int lo = 1;
    int hi = m * n;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int count = count(mid, m, n);

      if (count >= k) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    return lo;
  }

  private int count(int v, int m, int n) {
    int ans = 0;
    for (int i = 1; i <= m; i++) {
      ans += Math.min(v / i, n);
    }

    return ans;
  }
}
