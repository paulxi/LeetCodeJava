package com.leetcode.algorithm.easy.excelsheetcolumntitle;

class Solution {
  public String convertToTitle(int n) {
    if (n == 0) {
      return "";
    }

    return convertToTitle((n - 1) / 26) + (char)((n - 1) % 26 + 'A');
  }
}
