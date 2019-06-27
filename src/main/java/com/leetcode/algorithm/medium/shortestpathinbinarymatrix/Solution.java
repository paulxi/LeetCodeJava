package com.leetcode.algorithm.medium.shortestpathinbinarymatrix;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
  final static int[][] dirs = new int[][] {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

  public int shortestPathBinaryMatrix(int[][] grid) {
    if (grid[0][0] == 1) {
      return -1;
    }
    int m = grid.length;
    int n = grid[0].length;
    boolean[][] visited = new boolean[m][n];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {0, 0});
    visited[0][0] = true;

    int ans = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        int[] pos = queue.poll();

        for (int[] d: dirs) {
          int x = pos[0] + d[0];
          int y = pos[1] + d[1];

          if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 0 && !visited[x][y]) {
            if (x == m - 1 && y == n - 1) {
              return ans + 1;
            }

            queue.offer(new int[] {x, y});
            visited[x][y] = true;
          }
        }
      }
      ans++;
    }

    return -1;
  }
}
