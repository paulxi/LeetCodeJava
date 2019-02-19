package com.leetcode.algorithm.medium.pacificatlanticwaterflow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
  public List<int[]> pacificAtlantic(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return new ArrayList<>();
    }
    int m = matrix.length;
    int n = matrix[0].length;
    boolean[][] pVisited = new boolean[m][n];
    boolean[][] aVisited = new boolean[m][n];

    Queue<int[]> pQueue = new LinkedList<>();
    Queue<int[]> aQueue = new LinkedList<>();

    for (int i = 0; i < m; i++) {
      pQueue.offer(new int[] {i, 0});
      aQueue.offer(new int[] {i, n - 1});
      pVisited[i][0] = true;
      aVisited[i][n -1] = true;
    }
    for (int i = 0; i < n; i++) {
      pQueue.offer(new int[] {0, i});
      aQueue.offer(new int[] {m - 1, i});
      pVisited[0][i] = true;
      aVisited[m - 1][i] = true;
    }

    bfs(matrix, m, n, pQueue, pVisited);
    bfs(matrix, m, n, aQueue, aVisited);

    List<int[]> ans = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (pVisited[i][j] && aVisited[i][j]) {
          ans.add(new int[] {i, j});
        }
      }
    }

    return ans;
  }

  private void bfs(int[][]matrix, int m, int n, Queue<int[]> queue, boolean[][] visited) {
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    while (!queue.isEmpty()) {
      int[] pos = queue.poll();

      for (int[] dir: dirs) {
        int x = pos[0] + dir[0];
        int y = pos[1] + dir[1];

        if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]
            && matrix[x][y] >= matrix[pos[0]][pos[1]]) {
          queue.offer(new int[] {x, y});
          visited[x][y] = true;
        }
      }
    }
  }
}
