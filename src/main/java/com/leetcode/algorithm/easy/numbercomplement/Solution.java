package com.leetcode.algorithm.easy.numbercomplement;

class Solution {
  public int findComplement(int num) {
    int i = 0;
    int j = 0;
    while (i < num) {
      i += 1 << j;
      j++;
    }

    return i - num;
  }
}
