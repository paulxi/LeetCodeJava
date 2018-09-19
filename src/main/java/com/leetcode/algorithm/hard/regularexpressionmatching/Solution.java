package com.leetcode.algorithm.hard.regularexpressionmatching;

public class Solution {
  /**
   * Given an input string (s) and a pattern (p), implement regular expression
   * matching with support for '.' and '*'.
   * @param s source string
   * @param p pattern string
   * @return matching result
   */
  public boolean isMatch(String s, String p) {
    boolean[][] result = new boolean[s.length() + 1][p.length() + 1];
    result[0][0] = true;

    for (int i = 0; i < p.length(); i++) {
      if (p.charAt(i) == '*') {
        result[0][i + 1] = result[0][i - 1];
      }
    }

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < p.length(); j++) {
        if (s.charAt(i) == p.charAt(j)) {
          result[i + 1][j + 1] = result[i][j];
        } else if (p.charAt(j) == '.') {
          result[i + 1][j + 1] = result[i][j];
        } else if (p.charAt(j) == '*') {
          if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
            result[i + 1][j + 1] = result[i + 1][j - 1];
          } else {
            result[i + 1][j + 1] = (result[i + 1][j] || result[i][j + 1] || result[i + 1][j - 1]);
          }
        }
      }
    }

    return result[s.length()][p.length()];
  }
}
