package com.leetcode.algorithm.medium.longestsubstringwithoutrepeatingcharacters;

class Solution {
  /**
   * Given a string, find the length of the longest substring without repeating characters.
   * @param s the given string
   * @return the length of the longest substring without repeating characters
   */
  public int lengthOfLongestSubstring(String s) {
    final int strLen = s.length();
    int index = 0;
    int maxLength = 0;
    String currentStr = "";
    int currentStrLen = currentStr.length();

    while (index + maxLength - currentStrLen < strLen) {
      char ch = s.charAt(index);
      int pos = currentStr.indexOf(ch);

      if (pos < 0) {
        currentStr += (Character)ch;
      } else {
        currentStr = currentStr.substring(pos + 1) + (Character)ch;
      }

      currentStrLen = currentStr.length();

      if (pos < 0) {
        if (currentStrLen > maxLength) {
          maxLength = currentStrLen;
        }
      }

      index++;
    }

    return maxLength;
  }
}
