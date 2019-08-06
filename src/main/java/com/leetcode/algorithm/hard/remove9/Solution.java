package com.leetcode.algorithm.hard.remove9;

class Solution {
  public int newInteger(int n) {
    return Integer.parseInt(Integer.toString(n, 9));
  }

  public int newInteger2(int n) {
    int base = 1;
    int ans = 0;
    while (n != 0) {
      ans += (n % 9) * base;
      n /= 9;
      base *= 10;
    }
    return ans;
  }
}
