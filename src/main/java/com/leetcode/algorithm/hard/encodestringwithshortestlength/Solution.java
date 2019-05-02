package com.leetcode.algorithm.hard.encodestringwithshortestlength;

class Solution {
  public String encode(String s) {
    int n = s.length();
    String[][] dp = new String[n][n];

    for (int l = 0; l < n; l++) {
      for (int i = 0; i < n - l; i++) {
        int j = i + l;
        String sub = s.substring(i, j + 1);
        if (j - i < 4) {
          dp[i][j] = sub;
        } else {
          dp[i][j] = sub;

          for (int k = i; k < j; k++) {
            if (dp[i][k].length() + dp[k + 1][j].length() < dp[i][j].length()) {
              dp[i][j] = dp[i][k] + dp[k + 1][j];
            }
          }

          for (int k = 0; k < sub.length(); k++) {
            String repeat = sub.substring(0, k + 1);
            if (repeat != null
                && sub.length() % repeat.length() == 0
                && sub.replaceAll(repeat, "").length() == 0) {
              String ss = sub.length() / repeat.length() + "[" + dp[i][i + k] + "]";
              if (ss.length() < dp[i][j].length()) {
                dp[i][j] = ss;
              }
            }
          }
        }
      }
    }

    return dp[0][n - 1];
  }
}
