package com.leetcode.algorithm.easy.reversebits;

public class Solution {
  // you need treat n as an unsigned value
  public int reverseBits(int num) {
    int result = 0;
    int orig = num;
    for (int i = 0; i < 32; i++) {
      int remainder = orig % 2;
      orig >>>= 1;
      result <<= 1;
      result += remainder;
    }

    return result;
  }
}
