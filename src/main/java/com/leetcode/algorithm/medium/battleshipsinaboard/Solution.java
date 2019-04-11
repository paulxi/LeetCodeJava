package com.leetcode.algorithm.medium.battleshipsinaboard;

class Solution {
  public int countBattleships(char[][] board) {
    int m = board.length;
    int n = board[0].length;

    int count = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == '.') {
          continue;
        }

        if (i > 0 && board[i - 1][j] == 'X') {
          continue;
        }

        if (j > 0 && board[i][j - 1] == 'X') {
          continue;
        }

        count++;
      }
    }

    return count;
  }
}
