package com.leetcode.algorithm.easy.distringmatch;

class Solution {
  public int[] diStringMatch(String s) {
    int[] result = new int[s.length() + 1];
    int low = 0, high = s.length();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'I') {
        result[i] = low;
        low += 1;
      } else {
        result[i] = high;
        high -= 1;
      }
    }

    result[s.length()] = low;

    return result;
  }
}
