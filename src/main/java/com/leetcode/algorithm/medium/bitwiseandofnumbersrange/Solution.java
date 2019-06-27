package com.leetcode.algorithm.medium.bitwiseandofnumbersrange;

class Solution {
  public int rangeBitwiseAnd(int m, int n) {
    int mul = 1;
    while (m != n) {
      m >>= 1;
      n >>= 1;
      mul <<= 1;
    }

    return m * mul;
  }
}
