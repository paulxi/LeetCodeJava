package com.leetcode.algorithm.easy.generateastringwithcharacters;

class Solution {
  public String generateTheString(int n) {
    if (n % 2 == 1) {
      return "a".repeat(n);
    } else {
      return "a".repeat(n - 1) + "b";
    }
  }
}
