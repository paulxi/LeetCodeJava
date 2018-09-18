package com.leetcode.algorithm.easy.reverseinteger;

import java.util.ArrayList;

public class Solution {
  /**
   * Given a 32-bit signed integer, reverse digits of an integer.
   * @param x the given number
   * @return reversed number
   */
  public int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
        return 0;
      }
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
        return 0;
      }
      rev = rev * 10 + pop;
    }
    return rev;
  }
}
