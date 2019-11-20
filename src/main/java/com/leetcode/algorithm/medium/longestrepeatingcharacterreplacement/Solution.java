package com.leetcode.algorithm.medium.longestrepeatingcharacterreplacement;

class Solution {
  public int characterReplacement(String s, int k) {
    int len = s.length();
    int[] count = new int[26];
    int start = 0;
    int maxCount = 0;
    int maxLength = 0;
    for (int end = 0; end < len; end++) {
      maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
      while (end - start + 1 - maxCount > k) {
        count[s.charAt(start) - 'A']--;
        start++;
      }
      maxLength = Math.max(maxLength, end - start + 1);
    }
    return maxLength;
  }
}
