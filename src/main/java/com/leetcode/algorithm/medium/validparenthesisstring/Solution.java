package com.leetcode.algorithm.medium.validparenthesisstring;

class Solution {
  public boolean checkValidString(String s) {
    int lo = 0;
    int hi = 0;
    for (char c: s.toCharArray()) {
      lo += c == '(' ? 1 : -1;
      hi += c != ')' ? 1 : -1;
      if (hi < 0) {
        return false;
      }
      lo = Math.max(lo, 0);
    }

    return lo == 0;
  }
}
