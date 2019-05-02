package com.leetcode.algorithm.hard.minimumwindowsubsequence;

import java.util.Arrays;

class Solution {
  public String minWindow(String s, String t) {
    int m = s.length();
    int n = t.length();
    int[][] dp = new int[m][n];

    for (int[] tmp: dp) {
      Arrays.fill(tmp, -1);
    }

    for (int i = 0; i < m; i++) {
      if (s.charAt(i) == t.charAt(0)) {
        dp[i][0] = i;
      }
    }

    for (int j = 1; j < n; j++) {
      int tmp = -1;
      for (int i = 0; i < m; i++) {
        if (s.charAt(i) == t.charAt(j)) {
          dp[i][j] = tmp;
        }
        tmp = Math.max(tmp, dp[i][j - 1]);
      }
    }

    int minLength = Integer.MAX_VALUE;
    int minStart = -1;
    for (int i = 0; i < s.length(); i++) {
      if (dp[i][n - 1] != -1 && (i - dp[i][n - 1] + 1) < minLength) {
        minLength =  i - dp[i][n - 1] + 1;
        minStart = dp[i][n - 1];
      }
    }

    return minStart == -1 ? "" : s.substring(minStart, minStart + minLength);
  }
}
