package com.leetcode.algorithm.easy.excelsheetcolumnnumber;

class Solution {
  public int titleToNumber(String s) {
    char[] chars = s.toCharArray();
    int ans = 0;
    for (int i = 0; i < chars.length; i++) {
      ans = ans * 26 + (chars[i] - 'A' + 1);
    }

    return ans;
  }
}
