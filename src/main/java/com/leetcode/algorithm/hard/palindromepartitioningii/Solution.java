package com.leetcode.algorithm.hard.palindromepartitioningii;

class Solution {
  public int minCut(String s) {
    int n = s.length();
    int[] cut = new int[n];
    boolean[][] pal = new boolean[n][n];
    char[] c = s.toCharArray();

    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = 0; j <= i; j++) {
        if (c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
          pal[j][i] = true;
          min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
        }
      }
      cut[i] = min;
    }

    return cut[n - 1];
  }
}
