package com.leetcode.algorithm.easy.reversestring;

class Solution {
  public String reverseString(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {
      char temp = chars[i];
      int j = chars.length - 1 - i;
      chars[i] = chars[j];
      chars[j] = temp;
    }

    return new String(chars);
  }
}
