package com.leetcode.algorithm.medium.expressivewords;

class Solution {
  public int expressiveWords(String s, String[] words) {
    int res = 0;
    for (String w: words) {
      if (check(s, w)) {
        res++;
      }
    }

    return res;
  }

  private boolean check(String s, String w) {
    int sLen = s.length();
    int wLen = w.length();

    int i = 0;
    int i2 = 0;
    int j = 0;
    int j2 = 0;
    while (i < sLen && j < wLen) {
      if (s.charAt(i) != w.charAt(j)) {
        return false;
      }

      while (i2 < sLen && s.charAt(i2) == s.charAt(i)) {
        i2++;
      }
      while (j2 < wLen && w.charAt(j2) == w.charAt(j)) {
        j2++;
      }

      if (i2 - i != j2 - j) {
        if (i2 - i < j2 - j || i2 - i < 3) {
          return false;
        }
      }

      i = i2;
      j = j2;
    }

    return i == sLen && j == wLen;
  }
}
