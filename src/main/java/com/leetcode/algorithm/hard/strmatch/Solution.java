package com.leetcode.algorithm.hard.strmatch;

class Solution {
  public boolean isMatch(String s, String p) {
    boolean ans = isMatch(s, 0, p, 0);
    return ans;
  }

  private boolean isMatch(String s, int sPos, String p, int pPos) {
    if (sPos >= s.length() && pPos >= p.length()) {
      return true;
    }

    if (sPos >= s.length() || pPos >= p.length()) {
      return false;
    }

    boolean match = false;

    if (pPos + 1 < p.length() && p.charAt(pPos + 1) == '{') {
      int end = p.indexOf('}', pPos + 2);
      int[] range = getRange(p.substring(pPos + 2, end));

      char c = p.charAt(pPos);

      for (int i = range[0], j = 0; i < range[1]; i++, j++) {
        if (s.charAt(sPos + j) == c) {
          match = isMatch(s, sPos + i, p, end + 1);
          if (match) {
            return true;
          }
        } else {
          break;
        }
      }
    } else {
      if (s.charAt(sPos) == p.charAt(pPos)) {
        match = isMatch(s, sPos + 1, p, pPos + 1);
      }
    }

    return match;
  }

  private int[] getRange(String str) {
    int[] result = new int[2];
    String[] strs = str.split(",");
    result[0] = Integer.valueOf(strs[0]);
    result[1] = Integer.valueOf(strs[1]);

    return result;
  }
}
