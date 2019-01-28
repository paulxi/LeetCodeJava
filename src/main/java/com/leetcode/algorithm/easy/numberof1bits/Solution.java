package com.leetcode.algorithm.easy.numberof1bits;

public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      count += n % 2 == 0 ? 0 : 1;
      n = n >>> 1;
    }
    return count;
  }
}
