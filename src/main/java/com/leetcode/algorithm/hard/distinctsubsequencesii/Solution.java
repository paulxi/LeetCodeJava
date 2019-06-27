package com.leetcode.algorithm.hard.distinctsubsequencesii;

class Solution {
  public int distinctSubseqII(String str) {
    int[] end = new int[26];
    int added = 0;
    int res = 0;
    int mod = (int)1e9 + 7;
    for (char c: str.toCharArray()) {
      added = (res + 1 - end[c - 'a']) % mod;
      res = (res + added) % mod;
      end[c - 'a'] = (end[c- 'a'] + added) % mod;
    }
    return (res + mod) % mod;
  }
}
