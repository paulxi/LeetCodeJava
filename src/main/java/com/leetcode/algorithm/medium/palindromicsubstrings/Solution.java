package com.leetcode.algorithm.medium.palindromicsubstrings;

class Solution {
  public int countSubstrings(String s) {
    int n = s.length();
    boolean[][] dp = new boolean[n][n];
    int result = 0;

    for (int i = n - 1; i >= 0; i--) {
      for (int j = i; j < n; j++) {
        if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
          dp[i][j] = true;
        }

        if (dp[i][j]) {
          result += 1;
        }
      }
    }

    return result;
  }
}
