package com.leetcode.algorithm.medium.longestrepeatingsubstring;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int longestRepeatingSubstring(String s) {
    char[] cs = s.toCharArray();
    int lo = 1;
    int hi = cs.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (search(cs, mid)) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return lo - 1;
  }

  private boolean search(char[] cs, int k) {
    Set<Integer> set = new HashSet<>();
    long mod = 1000000007;
    long pow = 1;
    long cur = 0;
    for (int i = 0; i < cs.length; i++) {
      cur = (cur * 26 + (cs[i] - 'a')) % mod;
      if (i >= k) {
        cur = (cur - (cs[i - k] - 'a') * pow % mod + mod) % mod;
      } else {
        pow = pow * 26 % mod;
      }
      if (i >= k - 1) {
        if (!set.add((int)cur)) {
          return true;
        }
      }
    }
    return false;
  }
}
