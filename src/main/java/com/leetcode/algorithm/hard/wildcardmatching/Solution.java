package com.leetcode.algorithm.hard.wildcardmatching;

class Solution {
  public boolean isMatch(String s, String p) {
    int m = s.length();
    int n = p.length();
    boolean[][] result = new boolean[m + 1][n + 1];
    result[0][0] = true;

    for (int i = 1; i <= n; i++) {
      char c = p.charAt(i - 1);
      if (c == '*') {
        result[0][i] = result[0][i - 1];
      }
    }

    for (int i = 1; i < result.length; i++) {
      for (int j = 1; j < result[0].length; j++) {
        char sc = s.charAt(i - 1);
        char pc = p.charAt(j - 1);

        if (sc == pc) {
          result[i][j] = result[i - 1][j - 1];
        } else if (pc == '?') {
          result[i][j] = result[i - 1][j - 1];
        } else if (pc == '*') {
          result[i][j] = result[i - 1][j - 1] || result[i][j - 1] || result[i - 1][j];
        }
      }
    }

    return result[m][n];
  }
}
