package com.leetcode.algorithm.hard.trappingrainwaterii;

import java.util.PriorityQueue;

class Solution {
  public int trapRainWater(int[][] heightMap) {
    int m = heightMap.length;
    if (m <= 1) {
      return 0;
    }
    int n = heightMap[0].length;
    if (n <= 1) {
      return 0;
    }

    boolean[][] visited = new boolean[m][n];
    PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
          visited[i][j] = true;
          queue.offer(new int[]{i, j, heightMap[i][j]});
        }
      }
    }

    int result = 0;
    int[][] dirs = new int[][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    while (!queue.isEmpty()) {
      int[] cell = queue.poll();
      for (int[] d: dirs) {
        int i = cell[0] + d[0];
        int j = cell[1] + d[1];

        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
          continue;
        }

        result += Math.max(0, cell[2] - heightMap[i][j]);
        visited[i][j] = true;
        queue.offer(new int[] {i, j, Math.max(cell[2], heightMap[i][j])});
      }
    }

    return result;
  }
}
