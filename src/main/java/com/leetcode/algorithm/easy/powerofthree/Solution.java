package com.leetcode.algorithm.easy.powerofthree;

class Solution {
//  public boolean isPowerOfThree(int n) {
//    // 1162261467 is 3^19,  3^20 is bigger than int
//    int maxPowerOfThreeInt = 1162261467;
//    return (n > 0 && maxPowerOfThreeInt % n == 0);
//  }

  public boolean isPowerOfThree(int n) {
    String base = Integer.toString(n, 3);
    return base.matches("^10*$");
  }
}
