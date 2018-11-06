package com.leetcode.algorithm.medium.wordsearch;

class Solution {
  public boolean exist(char[][] board, String word) {
    if (board.length == 0) {
      return false;
    }
    int rows = board.length;
    int columns = board[0].length;
    boolean[][] visited = new boolean[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (search(board, word, i, j, 0, visited)) {
          return true;
        }
      }
    }

    return false;
  }

  private boolean search(char[][] board, String word, int row, int column, int index, boolean[][] visited) {
    if (index == word.length()) {
      return true;
    }

    int rows = board.length;
    int columns = board[0].length;
    char c = word.charAt(index);
    if (row < 0 || row == rows || column < 0 || column == columns || visited[row][column] || board[row][column] != c) {
      return false;
    }

    visited[row][column] = true;
    if (c == board[row][column]) {
      return search(board, word, row - 1, column, index + 1, visited)
          || search(board, word, row + 1, column, index + 1, visited)
          || search(board, word, row, column - 1, index + 1, visited)
          || search(board, word, row, column + 1, index + 1, visited);
    }
    visited[row][column] = false;
    return false;
  }
}
