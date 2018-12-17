package com.leetcode.algorithm.easy.hammingdistance;

class Solution {
  public int hammingDistance(int x, int y) {
    int xor = x ^ y, count = 0;
    while (xor > 0) {
      if (xor % 2 == 1) {
        count += 1;
      }
      xor /= 2;
    }
    return count;
  }
}
