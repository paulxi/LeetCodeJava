package com.leetcode.algorithm.easy.tolowercase;

class Solution {
  public String toLowerCase(String str) {
    if (str == null || str.length() == 0) {
      return str;
    }

    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (c >= 'A' && c <= 'Z') {
        chars[i] += 'a' - 'A';
      }
    }

    return new String(chars);
  }
}
