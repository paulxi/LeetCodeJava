package com.leetcode.algorithm.medium.numberofislands;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int numIslands(char[][] grid) {
    int num = 0;
    int rows = grid.length;
    if (rows == 0) {
      return 0;
    }
    int cols = grid[0].length;
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (grid[row][col] == '1') {
          num++;
          grid[row][col] = '0';

          Queue<Integer> queue = new LinkedList<>();
          queue.add(row * cols + col);
          while (!queue.isEmpty()) {
            int id = queue.remove();
            int r = id / cols;
            int c = id % cols;
            if (c > 0 && grid[r][c - 1] == '1') {
              grid[r][c - 1] = '0';
              queue.add(id - 1);
            }
            if (c < cols - 1 && grid[r][c + 1] == '1') {
              grid[r][c + 1] = '0';
              queue.add(id + 1);
            }
            if (r > 0 && grid[r - 1][c] == '1') {
              grid[r - 1][c] = '0';
              queue.add(id - cols);
            }
            if (r < rows - 1 && grid[r + 1][c] == '1') {
              grid[r + 1][c] = '0';
              queue.add(id + cols);
            }
          }
        }
      }
    }
    return num;
  }
}
