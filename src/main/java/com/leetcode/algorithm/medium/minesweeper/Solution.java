package com.leetcode.algorithm.medium.minesweeper;

class Solution {
  public char[][] updateBoard(char[][] board, int[] click) {
    int m = board.length;
    int n = board[0].length;
    int row = click[0];
    int col = click[1];

    if (board[row][col] == 'M') {
      board[row][col] = 'X';
      return board;
    }

    int count = 0;
    for (int i = -1; i < 2; i++) {
      for (int j = -1; j < 2; j++) {
        if (i == 0 && j == 0) {
          continue;
        }

        int r = row + i;
        int c = col + j;

        if (r < 0 || r >= m || c < 0 || c >= n) {
          continue;
        }

        if (board[r][c] == 'M' || board[r][c] == 'X') {
          count++;
        }
      }
    }

    if (count > 0) {
      board[row][col] = (char)('0' +  count);
    } else {
      board[row][col] = 'B';

      for (int i = -1; i < 2; i++) {
        for (int j = -1; j < 2; j++) {
          if (i == 0 && j == 0) {
            continue;
          }

          int r = row + i;
          int c = col + j;

          if (r < 0 || r >= m || c < 0 || c >= n) {
            continue;
          }

          if (board[r][c] == 'E') {
            updateBoard(board, new int[] {r, c});
          }
        }
      }
    }

    return board;
  }
}
