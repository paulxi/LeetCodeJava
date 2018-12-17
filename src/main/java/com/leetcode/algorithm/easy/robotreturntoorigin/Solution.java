package com.leetcode.algorithm.easy.robotreturntoorigin;

class Solution {
  public boolean judgeCircle(String moves) {
    int row = 0, col = 0;

    for (char c: moves.toCharArray()) {
      if (c == 'U') {
        col += 1;
      } else if (c == 'D') {
        col -= 1;
      } else if (c == 'L') {
        row -= 1;
      } else if (c == 'R') {
        row += 1;
      }
    }

    return row == 0 && col == 0;
  }
}
