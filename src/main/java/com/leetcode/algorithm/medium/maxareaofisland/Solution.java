package com.leetcode.algorithm.medium.maxareaofisland;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
  public int maxAreaOfIsland(int[][] grid) {
    int result = 0;
    if (grid.length == 0 || grid[0].length == 0) {
      return result;
    }

    Set<Integer> visited = new HashSet<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1 && !visited.contains(i * grid[0].length + j)) {
          Stack<Integer> visiting = new Stack<>();
          visiting.push(i * grid[0].length + j);
          int count = 0;
          while (!visiting.isEmpty()) {
            int pos = visiting.pop();
            int row = pos / grid[0].length;
            int col = pos % grid[0].length;
            visited.add(pos);
            count++;

            if (row > 0) {
              if (grid[row - 1][col] == 1 &&
                  !visiting.contains((row - 1) * grid[0].length + col) &&
                  !visited.contains((row - 1) * grid[0].length + col)) {
                visiting.add((row - 1) * grid[0].length + col);
              }
            }
            if (row < grid.length - 1) {
              if (grid[row + 1][col] == 1 &&
                  !visiting.contains((row + 1) * grid[0].length + col) &&
                  !visited.contains((row + 1) * grid[0].length + col)) {
                visiting.add((row + 1) * grid[0].length + col);
              }
            }
            if (col > 0) {
              if (grid[row][col - 1] == 1 &&
                  !visiting.contains(row * grid[0].length + col - 1) &&
                  !visited.contains(row * grid[0].length + col - 1)) {
                visiting.add(row * grid[0].length + col - 1);
              }
            }
            if (col < grid[0].length - 1) {
              if (grid[row][col + 1] == 1 &&
                  !visiting.contains(row * grid[0].length + col + 1) &&
                  !visited.contains(row * grid[0].length + col + 1)) {
                visiting.add(row * grid[0].length + col + 1);
              }
            }
          }

          result = Math.max(result, count);
        }
      }
    }

    return result;
  }
}
