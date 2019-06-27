package com.leetcode.algorithm.medium.campusbikesii;

import java.util.Arrays;

class Solution {
  private int min = Integer.MAX_VALUE;

  public int assignBikes(int[][] workers, int[][] bikes) {
    dfs(workers, 0, bikes, 0, new boolean[bikes.length]);
    return min;
  }

  private void dfs(int[][] workers, int index, int[][] bikes, int dist, boolean[] visited) {
    if (index == workers.length) {
      min = Math.min(min, dist);
      return;
    }

    if (dist > min) {
      return;
    }

    for (int i = 0; i < bikes.length; i++) {
      if (visited[i]) {
        continue;
      }

      visited[i] = true;
      dfs(workers, index + 1, bikes, dist + dis(workers[index], bikes[i]), visited);
      visited[i] = false;
    }
  }

  private int dis(int[] p1, int[] p2) {
    return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
  }

  public int assignBikes2(int[][] workers, int[][] bikes) {
    int n = workers.length;
    int m = bikes.length;
    int[][] dp = new int[n + 1][1 << m];
    for (int[] d : dp) {
      Arrays.fill(d, Integer.MAX_VALUE / 2);
    }
    dp[0][0] = 0;
    int ans = Integer.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s < (1 << m); s++) {
        for (int j = 0; j < m; j++) {
          if ((s & (1 << j)) == 0) {
            continue;
          }

          int prev = s ^ (1 << j);
          dp[i][s] = Math.min(dp[i][s], dp[i - 1][prev] + dis(workers[i - 1], bikes[j]));
          if (i == n) {
            ans = Math.min(ans, dp[i][s]);
          }
        }
      }
    }

    return ans;
  }
}
