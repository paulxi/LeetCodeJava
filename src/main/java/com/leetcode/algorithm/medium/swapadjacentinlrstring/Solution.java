package com.leetcode.algorithm.medium.swapadjacentinlrstring;

class Solution {
  public boolean canTransform(String start, String end) {
    int l = 0;
    int r = 0;

    for (int i = 0; i < start.length(); i++) {
      if (start.charAt(i) == 'L') {
        l++;
      }
      if (end.charAt(i) == 'L') {
        l--;
      }
      if (start.charAt(i) == 'R') {
        r++;
      }
      if (end.charAt(i) == 'R') {
        r--;
      }

      if (l > 0 || r < 0 || (l < 0 && r != 0) || (r > 0 && l != 0)) {
        return false;
      }
    }

    return l == 0 && r == 0;
  }
}
