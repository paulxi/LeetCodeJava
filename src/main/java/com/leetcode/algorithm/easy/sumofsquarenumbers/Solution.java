package com.leetcode.algorithm.easy.sumofsquarenumbers;

class Solution {
  public boolean judgeSquareSum(int c) {
    int high = (int)Math.sqrt(c);
    int low = 0;

    while (low <= high) {
      int value = low * low + high * high;
      if (value == c) {
        return true;
      } else if (value > c) {
        high--;
      } else {
        low++;
      }
    }

    return false;
  }
}
