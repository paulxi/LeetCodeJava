package com.leetcode.algorithm.easy.shortestdistancetoacharacter;

class Solution {
  public int[] shortestToChar(String s, char c) {
    int[] ans = new int[s.length()];
    int pos = -s.length();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        pos = i;
      }
      ans[i] = i - pos;
    }

    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == c) {
        pos = i;
      }
      ans[i] = Math.min(ans[i], Math.abs(i - pos));
    }

    return ans;
  }
}
