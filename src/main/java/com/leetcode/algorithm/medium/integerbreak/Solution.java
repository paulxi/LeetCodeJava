package com.leetcode.algorithm.medium.integerbreak;

class Solution {
  public int integerBreak(int n) {
    if (n == 2) {
      return 1;
    }
    if (n == 3) {
      return 2;
    }

    int production = 1;
    while (n > 4) {
      production *= 3;
      n -= 3;
    }

    production *= n;
    return production;
  }
}
