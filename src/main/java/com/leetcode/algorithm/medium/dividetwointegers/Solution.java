package com.leetcode.algorithm.medium.dividetwointegers;

class Solution {
  public int divide(int dividend, int divisor) {
    if (dividend == 0) {
      return 0;
    }

    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }

    int sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? 1 : -1;

    long ldividend = Math.abs((long)dividend);
    long ldivisor = Math.abs((long)divisor);

    int ans = 0;
    while (ldividend - ldivisor >= 0) {

      int multiple = 1;
      long temp = ldivisor;
      while (ldividend >= (temp << 1)) {
        multiple <<= 1;
        temp = temp << 1;
      }

      ans += multiple;
      ldividend -= temp;
    }

    return sign * ans;
  }
}
