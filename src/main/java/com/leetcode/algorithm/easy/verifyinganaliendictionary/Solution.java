package com.leetcode.algorithm.easy.verifyinganaliendictionary;

class Solution {
  public boolean isAlienSorted(String[] words, String order) {
    int[] mapping = new int[26];
    for (int i = 0; i < order.length(); i++) {
      mapping[order.charAt(i) - 'a'] = i;
    }

    for (int i = 1; i < words.length; i++) {
      if (compare(words[i - 1], words[i], mapping) > 0) {
        return false;
      }
    }

    return true;
  }

  private int compare(String s1, String s2, int[] mapping) {
    int m = s1.length();
    int n = s2.length();
    int cmp = 0;

    for (int i = 0, j = 0; i < m && j < n && cmp == 0; i++, j++) {
      cmp = mapping[s1.charAt(i) - 'a'] - mapping[s2.charAt(j) - 'a'];
    }

    return cmp == 0 ? m - n : cmp;
  }
}
