package com.leetcode.algorithm.easy.strstr;

class Solution {
//  public int strStr(String haystack, String needle) {
//    for (int i = 0; ; i++) {
//      for (int j = 0; ; j++) {
//        if (j == needle.length()) {
//          return i;
//        }
//        if (i + j == haystack.length()) {
//          return -1;
//        }
//        if (needle.charAt(j) != haystack.charAt(i + j)) {
//          break;
//        }
//      }
//    }
//  }

  public int strStr(String haystack, String needle) {
    int lenN = needle.length();
    if (lenN == 0) {
      return 0;
    }

    int[] next = generateNext(needle);

    int lenH = haystack.length();
    int i = 0, j = 0;
    while (i < lenH && j < lenN) {
      if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
        i += 1;
        j += 1;
      } else {
        j = next[j];
      }
    }

    if (j == lenN) {
      return i - j;
    }

    return -1;
  }

  private int[] generateNext(String p) {
    int len = p.length();
    int[] next = new int[len];
    next[0] = -1;
    int i = 0, j = -1;
    while (i + 1 < len) {
      if (j == -1 || p.charAt(i) == p.charAt(j)) {
        i += 1;
        j += 1;
        next[i] = j;
      } else {
        j = next[j];
      }
    }

    return next;
  }
}
