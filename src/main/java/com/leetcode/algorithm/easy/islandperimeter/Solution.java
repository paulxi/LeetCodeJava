package com.leetcode.algorithm.easy.islandperimeter;

class Solution {
  public int islandPerimeter(int[][] grid) {
    if (grid.length == 0 || grid[0].length == 0) {
      return 0;
    }

    int[][] copy = new int[grid.length + 2][grid[0].length + 2];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        copy[i + 1][j + 1] = grid[i][j];
      }
    }

    int result = 0;
    for (int i = 0; i < copy.length; i++) {
      for (int j = 0; j < copy[i].length; j++) {
        if (copy[i][j] == 1) {
          if (copy[i - 1][j] == 0) {
            result += 1;
          }
          if (copy[i + 1][j] == 0) {
            result += 1;
          }
          if (copy[i][j - 1] == 0) {
            result += 1;
          }
          if (copy[i][j + 1] == 0) {
            result += 1;
          }
        }
      }
    }

    return result;
  }
}
