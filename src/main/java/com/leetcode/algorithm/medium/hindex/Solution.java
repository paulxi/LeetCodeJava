package com.leetcode.algorithm.medium.hindex;

class Solution {
  public int hIndex(int[] citations) {
    int len = citations.length;
    int[] count = new int[len + 1];
    for (int c: citations) {
      count[Math.min(len, c)]++;
    }

    int total = 0;
    for (int i = len; i >= 0; i--) {
      total += count[i];
      if (total >= i) {
        return i;
      }
    }

    return 0;
  }
}
