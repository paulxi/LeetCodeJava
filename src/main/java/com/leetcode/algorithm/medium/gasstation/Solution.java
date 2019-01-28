package com.leetcode.algorithm.medium.gasstation;

class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int remain = 0;
    int debet = 0;
    int start = 0;
    for (int i = 0; i < gas.length; i++) {
      remain += gas[i] - cost[i];
      if (remain < 0) {
        debet += remain;
        start = i + 1;
        remain = 0;
      }
    }
    return remain + debet < 0 ? -1 : start;
  }
}
