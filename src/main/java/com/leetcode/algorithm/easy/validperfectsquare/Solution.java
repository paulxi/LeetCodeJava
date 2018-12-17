package com.leetcode.algorithm.easy.validperfectsquare;

class Solution {
  public boolean isPerfectSquare(int num) {
    int i = 1;
    while (true) {
      int value = i * i;
      if (value == num) {
        return true;
      } else if (value < 0 || value > num) {
        break;
      } else {
        i++;
      }
    }

    return false;
  }
}
