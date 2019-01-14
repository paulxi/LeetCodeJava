package com.leetcode.algorithm.medium.validsudoku;

import java.util.HashSet;

class Solution {
//  public boolean isValidSudoku(char[][] board) {
//    for (int row = 0; row < board.length; row++) {
//      boolean[] arr = new boolean[9];
//      for (int col = 0; col < board[row].length; col++) {
//        char c = board[row][col];
//        if (c != '.') {
//          int i = c - '1';
//          if (arr[i]) {
//            return false;
//          }
//          arr[i] = true;
//        }
//      }
//    }
//
//    for (int col = 0; col < board[0].length; col++) {
//      boolean[] arr = new boolean[9];
//      for (int row = 0; row < board.length; row++) {
//        char c = board[row][col];
//        if (c != '.') {
//          int i = c - '1';
//          if (arr[i]) {
//            return false;
//          }
//          arr[i] = true;
//        }
//      }
//    }
//
//    for (int row = 0; row < board.length; row += 3) {
//      for (int col = 0; col < board[row].length; col += 3) {
//        boolean[] arr = new boolean[9];
//        for (int i = row; i < row + 3; i++) {
//          for (int j = col; j < col + 3; j++) {
//            char c = board[i][j];
//            if (c != '.') {
//              int v = c - '1';
//              if (arr[v]) {
//                return false;
//              }
//              arr[v] = true;
//            }
//          }
//        }
//      }
//
//    }
//
//    return true;
//  }

  public boolean isValidSudoku(char[][] board) {
    HashSet<Character>[] rows = new HashSet[9];
    HashSet<Character>[] cols = new HashSet[9];
    HashSet<Character>[] boxes = new HashSet[9];

    for (int i = 0; i < 9; i++) {
      rows[i] = new HashSet<>();
      cols[i] = new HashSet<>();
      boxes[i] = new HashSet<>();
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char c = board[i][j];
        if (c != '.') {
          if (!rows[i].add(c)) {
            return false;
          }

          if (!cols[j].add(c)) {
            return false;
          }

          int boxIdx = (i / 3) * 3 + j / 3;
          if (!boxes[boxIdx].add(c)) {
            return false;
          }
        }
      }
    }

    return true;
  }
}
