package com.leetcode.algorithm.easy.findthedifference;

class Solution {
  public char findTheDifference(String s, String t) {
    int c = t.charAt(t.length() - 1);

    for (int i = 0; i < s.length(); i++) {
      c -= s.charAt(i);
      c += t.charAt(i);
    }

    return (char)c;
  }
}
