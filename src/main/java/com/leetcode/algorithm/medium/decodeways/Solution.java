package com.leetcode.algorithm.medium.decodeways;

class Solution {
  public int numDecodings(String s) {
    if (s.length() == 0) {
      return 1;
    }

    int[] dp = new int[s.length()];
    if (s.charAt(0) != '0') {
      dp[0] = 1;
    }

    for (int i = 1; i < s.length(); i++) {
      int first = Integer.valueOf(s.substring(i, i + 1));
      if (first >= 1 && first <= 9) {
        dp[i] += dp[i - 1];
      }
      int second = Integer.valueOf(s.substring(i - 1, i + 1));
      if (second >= 10 && second <= 26) {
        dp[i] += i >= 2 ? dp[i - 2] : 1;
      }
    }

    return dp[s.length() - 1];
  }
}
