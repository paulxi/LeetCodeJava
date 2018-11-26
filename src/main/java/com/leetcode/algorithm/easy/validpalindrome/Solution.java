package com.leetcode.algorithm.easy.validpalindrome;

class Solution {
  public boolean isPalindrome(String str) {
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
      char startChar = str.charAt(start);
      if (!Character.isLetterOrDigit(startChar)) {
        start += 1;
        continue;
      }
      char endChar = str.charAt(end);
      if (!Character.isLetterOrDigit(endChar)) {
        end -= 1;
        continue;
      }

      if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
        return false;
      } else {
        start += 1;
        end -= 1;

      }
    }

    return true;
  }
}
