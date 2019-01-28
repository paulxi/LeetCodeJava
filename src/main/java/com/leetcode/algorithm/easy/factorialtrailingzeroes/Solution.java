package com.leetcode.algorithm.easy.factorialtrailingzeroes;

class Solution {
  public int trailingZeroes(int n) {
    return n < 5 ? 0: n / 5 + trailingZeroes(n / 5);
  }
}
