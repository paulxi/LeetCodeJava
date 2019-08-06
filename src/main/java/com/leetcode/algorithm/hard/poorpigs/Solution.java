package com.leetcode.algorithm.hard.poorpigs;

class Solution {
  public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    int pigs = 0;
    while (Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets) {
      pigs++;
    }

    return pigs;
  }
}
