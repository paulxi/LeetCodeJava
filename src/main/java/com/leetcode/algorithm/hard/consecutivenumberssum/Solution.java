package com.leetcode.algorithm.hard.consecutivenumberssum;

class Solution {
  public int consecutiveNumbersSum(int num) {
    int ans = 1;

    for (int i = 2; i * (i + 1) / 2 <= num; i++) {
      if ((num - i * (i + 1) / 2) % i == 0) {
        ans++;
      }
    }

    return ans;
  }
}
