package com.leetcode.algorithm.medium.shortestbridge;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int shortestBridge(int[][] a) {
    if (a == null || a.length == 0 || a[0].length == 0) {
      return 0;
    }

    int m = a.length;
    int n = a[0].length;
    Queue<int[]> queue = new LinkedList<>();
    boolean found = false;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (a[i][j] == 1) {
          dfs(a, i, j, m, n, queue);
          found = true;
          break;
        }
      }

      if (found) {
        break;
      }
    }

    int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int ans = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] cur = queue.poll();
        for (int j = 0; j < 4; j++) {
          int x = cur[0] + dirs[j][0];
          int y = cur[1] + dirs[j][1];

          if (x < 0 || x >= m || y < 0 || y >= n) {
            continue;
          }

          if (a[x][y] == 1) {
            return ans;
          } else if (a[x][y] == 2) {
            continue;
          } else {
            a[x][y] = 2;
            queue.offer(new int[] {x, y});
          }
        }
      }
      ans++;
    }

    return -1;
  }

  private void dfs(int[][] a, int i, int j, int m, int n, Queue<int[]> queue) {
    queue.add(new int[]{i, j});
    a[i][j] = 2;
    if(i - 1 >= 0 && a[i - 1][j] == 1) {
      dfs(a, i - 1, j, m, n, queue);
    }
    if(i + 1 < m && a[i + 1][j] == 1) {
      dfs(a, i + 1, j, m, n, queue);
    }
    if(j - 1 >= 0 && a[i][j - 1] == 1) {
      dfs(a, i, j - 1, m, n, queue);
    }
    if(j + 1 < n && a[i][j + 1] == 1) {
      dfs(a, i, j + 1, m, n, queue);
    }
  }
}
