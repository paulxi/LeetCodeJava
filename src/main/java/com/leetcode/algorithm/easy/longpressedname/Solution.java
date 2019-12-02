package com.leetcode.algorithm.easy.longpressedname;

class Solution {
  public boolean isLongPressedName(String name, String typed) {
    int i = 0;
    int m = name.length();
    int n = typed.length();

    for (int j = 0; j < n; j++) {
      if (i < m && name.charAt(i) == typed.charAt(j)) {
        i++;
      } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
        return false;
      }
    }

    return i == m;
  }
}
