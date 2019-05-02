package com.leetcode.algorithm.medium.candycrush;

class Solution {
  public int[][] candyCrush(int[][] board) {
    int row = board.length;
    int col = board[0].length;
    boolean found = true;
    while (found) {
      found = false;

      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          int val = Math.abs(board[i][j]);
          if (val == 0) {
            continue;
          }

          if (j < col - 2 && Math.abs(board[i][j + 1]) == val && Math.abs(board[i][j + 2]) == val) {
            found = true;
            int ind = j;
            while (ind < col && Math.abs(board[i][ind]) == val) {
              board[i][ind] = -val;
              ind++;
            }
          }

          if (i < row - 2 && Math.abs(board[i + 1][j]) == val && Math.abs(board[i + 2][j]) == val) {
            found = true;
            int ind = i;
            while (ind < row && Math.abs(board[ind][j]) == val) {
              board[ind][j] = -val;
              ind++;
            }
          }
        }
      }

      if (found) {
        for (int j = 0; j < col; j++) {
          int storeInd = row - 1;
          for (int i = row - 1; i >= 0; i--) {
            if (board[i][j] > 0) {
              board[storeInd][j] = board[i][j];
              storeInd--;
            }
          }
          for (int k = storeInd; k >= 0; k--) {
            board[k][j] = 0;
          }
        }
      }
    }

    return board;
  }
}
