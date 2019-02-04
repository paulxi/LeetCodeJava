package com.leetcode.algorithm.medium.wallsandgates;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public void wallsAndGates(int[][] rooms) {
    if (rooms.length == 0 || rooms[0].length == 0) {
      return;
    }

    int m = rooms.length;
    int n = rooms[0].length;

    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (rooms[i][j] == 0) {
          queue.offer(new int[]{i, j});
        }
      }
    }

    int[][] dirs = new int[][] {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    while (!queue.isEmpty()) {
      int[] point = queue.poll();
      int row = point[0];
      int col = point[1];

      for (int[] dir: dirs) {
        int r = row + dir[0];
        int c = col + dir[1];

        if (r < 0 || r >= m || c < 0 || c >= n || rooms[r][c] != Integer.MAX_VALUE) {
          continue;
        }

        rooms[r][c] = rooms[row][col] + 1;
        queue.add(new int[] {r, c});
      }
    }
  }
}
