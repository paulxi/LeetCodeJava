package com.leetcode.algorithm.easy.firstuniquecharacteranastring;

class Solution {
  public int firstUniqChar(String s) {
    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) {
      int index = s.charAt(i) - 'a';
      freq[index] += 1;
    }

    for (int i = 0; i < s.length(); i++) {
      if (freq[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }
}
