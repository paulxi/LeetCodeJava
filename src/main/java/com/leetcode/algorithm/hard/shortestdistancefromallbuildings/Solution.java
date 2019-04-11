package com.leetcode.algorithm.hard.shortestdistancefromallbuildings;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int shortestDistance(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    int[][] dp = new int[m][n];
    int[][] reach = new int[m][n];
    int countBuilding  = 0;

    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          queue.offer(new int[]{i, j});
          bfs(queue, grid, dp, reach, m, n);
          countBuilding++;
        }
      }
    }

    int result = Integer.MAX_VALUE;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 0 && reach[i][j] == countBuilding) {
          result = Math.min(result, dp[i][j]);
        }
      }
    }

    return result == Integer.MAX_VALUE ? -1 : result;
  }

  private void bfs(Queue<int[]> queue, int[][] grid, int[][] dp, int[][] reach, int m, int n) {
    int level = 1;
    boolean[][] visited = new boolean[m][n];
    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        int[] curPoint = queue.poll();

        for (int[] dir: dirs) {
          int x = dir[0] + curPoint[0];
          int y = dir[1] + curPoint[1];

          if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 0 || visited[x][y]) {
            continue;
          }

          queue.offer(new int[] {x, y});
          visited[x][y] = true;
          dp[x][y] += level;
          reach[x][y]++;
        }
      }

      level++;
    }
  }
}
