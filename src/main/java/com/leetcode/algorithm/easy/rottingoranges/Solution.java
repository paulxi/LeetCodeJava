package com.leetcode.algorithm.easy.rottingoranges;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int orangesRotting(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    int count = 0;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1 || grid[i][j] == 2) {
          count++;

          if (grid[i][j] == 2) {
            queue.offer(new int[] {i, j});
          }
        }
      }
    }

    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int ans = 0;
    int rotted = queue.size();
    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        int[] pos = queue.poll();

        for (int[] d: dirs) {
          int x = d[0] + pos[0];
          int y = d[1] + pos[1];

          if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
            grid[x][y] = 2;
            queue.offer(new int[]{x, y});
          }
        }
      }

      if (!queue.isEmpty()) {
        rotted += queue.size();
        ans++;
      }
    }

    if (rotted == count) {
      return ans;
    } else {
      return -1;
    }
  }
}
