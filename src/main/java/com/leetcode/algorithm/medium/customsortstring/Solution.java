package com.leetcode.algorithm.medium.customsortstring;

class Solution {
  public String customSortString(String s, String t) {
    int[] count = new int[26];

    for (char c: t.toCharArray()) {
      count[c - 'a']++;
    }

    StringBuilder sb = new StringBuilder();
    for (char c: s.toCharArray()) {
      while (count[c - 'a'] > 0) {
        sb.append(c);
        count[c - 'a']--;
      }
    }

    for (char c = 'a'; c <= 'z'; c++) {
      while (count[c - 'a'] > 0) {
        sb.append(c);
        count[c - 'a']--;
      }
    }

    return sb.toString();
  }
}
