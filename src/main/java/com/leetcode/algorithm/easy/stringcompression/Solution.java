package com.leetcode.algorithm.easy.stringcompression;

class Solution {
  public int compress(char[] chars) {
    int pos = 0;
    int anchor = 0;

    for (int i = 0; i < chars.length; i++) {
      if (i + 1 == chars.length || chars[i + 1] != chars[i]) {
        chars[pos++] = chars[anchor];
        if (i > anchor) {
          for (char c: ("" + (i - anchor + 1)).toCharArray()) {
            chars[pos++] = c;
          }
        }

        anchor = i + 1;
      }
    }

    return pos;
  }
}
