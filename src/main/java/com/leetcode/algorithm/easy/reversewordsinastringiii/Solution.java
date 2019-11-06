package com.leetcode.algorithm.easy.reversewordsinastringiii;

class Solution {
  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != ' ') {
        int j = i;
        while (j + 1 < chars.length && chars[j + 1] != ' ') {
          j++;
        }
        reverse(chars, i, j);
        i = j;
      }
    }
    return new String(chars);
  }

  private void reverse(char[] chars, int i, int j) {
    for (; i < j; i++, j--) {
      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
    }
  }
}
