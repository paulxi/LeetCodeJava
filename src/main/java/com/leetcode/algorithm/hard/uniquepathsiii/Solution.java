package com.leetcode.algorithm.hard.uniquepathsiii;

class Solution {
  int ans;

  public int uniquePathsIII(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    int todo = 0;
    int[] start = new int[2];
    int[] target = new int[2];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] != -1) {
          todo++;
        }

        if (grid[i][j] == 1) {
          start[0] = i;
          start[1] = j;
        } else if (grid[i][j] == 2) {
          target[0] = i;
          target[1] = j;
        }
      }
    }

    ans = 0;
    dfs(grid, start, target, todo);
    return ans;
  }


  private void dfs(int[][] grid, int[] start, int[] target, int todo) {
    todo--;
    if (todo < 0) {
      return;
    }

    if (start[0] == target[0] && start[1] == target[1]) {
      if (todo == 0) {
        ans++;
      }

      return;
    }

    int row = start[0];
    int col = start[1];

    grid[row][col] = 3;

    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    for (int[] dir: dirs) {
      int x = dir[0] + row;
      int y = dir[1] + col;

      if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
        if (grid[x][y] == 0 || grid[x][y] == 2) {
          dfs(grid, new int[] {x, y}, target, todo);
        }
      }
    }

    grid[row][col] = 0;
  }
}
