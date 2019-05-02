package com.leetcode.algorithm.medium.addboldtaginstring;

class Solution {
  public String addBoldTag(String s, String[] dict) {
    int n = s.length();
    boolean[] bold = new boolean[n];
    for (int i = 0, end = 0; i < n; i++) {
      for (String word: dict) {
        if (s.startsWith(word, i)) {
          end = Math.max(end, i + word.length());
        }
      }

      bold[i] = end > i;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (!bold[i]) {
        sb.append(s.charAt(i));
        continue;
      }

      int j = i;
      while (j < s.length() && bold[j]) {
        j++;
      }
      sb.append("<b>" + s.substring(i, j) + "</b>");
      i = j - 1;
    }

    return sb.toString();
  }
}
