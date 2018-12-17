package com.leetcode.algorithm.easy.plusone;

import java.util.Arrays;

class Solution {
  public int[] plusOne(int[] digits) {
    int carrier = 1;
    int[] result = Arrays.copyOfRange(digits, 0, digits.length);
    for (int i = result.length - 1; i >=0; i--) {
      int num = result[i] + carrier;
      if (num == 10) {
        carrier = 1;
        result[i] = 0;
      } else {
        result[i] = num;
        carrier = 0;
        break;
      }
    }

    if (carrier == 1) {
      result = new int[result.length + 1];
      result[0] = 1;
    }

    return result;
  }
}
