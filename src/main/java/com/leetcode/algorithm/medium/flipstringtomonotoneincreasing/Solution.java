package com.leetcode.algorithm.medium.flipstringtomonotoneincreasing;

class Solution {
//  public int minFlipsMonoIncr(String str) {
//    int n = str.length();
//    int[] dp = new int[n + 1];
//    int countOne = 0;
//
//    for (int i = 0; i < str.length(); i++) {
//      if (str.charAt(i) == '1') {
//        dp[i + 1] = dp[i];
//        countOne++;
//      } else {
//        dp[i + 1] = Math.min(countOne, dp[i] + 1);
//      }
//    }
//
//    return dp[n];
//  }

  public int minFlipsMonoIncr(String str) {
    int p0 = 0;
    int p1 = 0;
    for (int i = 0; i < str.length(); i++) {
      p0 += str.charAt(i) - '0';
      p1 = Math.min(p0, p1 + 1 - (str.charAt(i) - '0'));
    }

    return p1;
  }
}
