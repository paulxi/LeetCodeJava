package com.leetcode.algorithm.easy.sumoftwointegers;

class Solution {
  public int getSum(int a, int b) {
    if (a == 0) {
      return b;
    }
    if (b == 0) {
      return a;
    }

    while (b != 0) {
      int carry = a & b;
      a = a ^ b;
      b = carry << 1;
    }

    return a;
  }

  public int getSubtract(int a, int b) {
    while (b != 0) {
      int borrow = (~a) & b;
      a = a ^ b;
      b = borrow << 1;
    }

    return a;
  }
}
