package com.leetcode.algorithm.medium.longestpalindrome;

public class Solution {
  /**
   * Given a string s, find the longest palindromic substring in s.
   * @param s a given string
   * @return the longest palindromic substring
   */
  public String longestPalindrome(String s) {
    String result = "";

    for (int i = 0; i < s.length(); i++) {
      String palindrome1 = findPalindrome(s, i, i);
      String palindrome2 = findPalindrome(s, i, i + 1);

      if (palindrome1.length() > result.length()) {
        result = palindrome1;
      }

      if (palindrome2.length() > result.length()) {
        result = palindrome2;
      }
    }

    return result;
  }

  private String findPalindrome(String s, int leftStartIndex, int rightStartIndex) {
    int strLength = s.length();
    int left = leftStartIndex;
    int right = rightStartIndex;
    StringBuilder result = new StringBuilder();

    while (left >= 0 && right < strLength) {
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);
      if (leftChar == rightChar) {
        result = result.append(rightChar);
        if (left != right) {
          result = result.insert(0, leftChar);
        }

        left += -1;
        right += 1;
      } else {
        break;
      }
    }

    return result.toString();
  }
}
