package com.leetcode.algorithm.hard.countdifferentpalindromicsubsequences;

class Solution {
  public int countPalindromicSubsequences(String str) {
    int len = str.length();
    int mod = 1000000007;
    int[][][] dp = new int[4][len][len];

    for (int i = len - 1; i >= 0; i--) {
      for (int j = i; j < len; j++) {
        for (int k = 0; k < 4; k++) {
          char c = (char) ('a' + k);
          if (j == i) {
            if (str.charAt(j) == c) {
              dp[k][i][j] = 1;
            } else {
              dp[k][i][j] = 0;
            }
          } else {
            if (str.charAt(i) != c) {
              dp[k][i][j] = dp[k][i + 1][j];
            } else if (str.charAt(j) != c) {
              dp[k][i][j] = dp[k][i][j - 1];
            } else {
              dp[k][i][j] = 2;
              if (j > i + 1) {
                for (int m = 0; m < 4; m++) {
                  dp[k][i][j] += dp[m][i + 1][j - 1];
                  dp[k][i][j] %= mod;
                }
              }
            }
          }
        }
      }
    }

    int ans = 0;
    for (int i = 0; i < 4; i++) {
      ans += dp[i][0][len - 1];
      ans %= mod;
    }

    return ans;
  }
}
