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

  public int reverseBits2(int num) {
    num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
    num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
    num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
    num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
    num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);

    return num;
  }
}
