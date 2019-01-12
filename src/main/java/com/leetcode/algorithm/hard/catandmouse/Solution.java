package com.leetcode.algorithm.hard.catandmouse;

import java.util.Arrays;

class Solution {
  public int catMouseGame(int[][] graph) {
    int n = graph.length;
    int[][] dp = new int[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(dp[i], -1);
    }

    for (int i = 1; i < n; ++i) {
      dp[0][i] = 1;   // mouse reached home, m win
      dp[i][i] = 2;   // cat met mouse, cat win
    }

    return helper(graph, 1, 2, dp);
  }

  private int helper(int[][] graph, int mouse, int cat, int dp[][]) {

    if (dp[mouse][cat] != -1) {
      return dp[mouse][cat];  // use cached value
    }

    dp[mouse][cat] = 0;  // if there is a cycle, draw
    int mouseDefault = 2;  //  default cat win, try to update this number to 1 or 0
    int[] mouseGoList = graph[mouse], catGoList = graph[cat];

    for (int mouseGo : mouseGoList) {
      if (mouseGo == cat) {
        continue;   // I'm a mouse, why go for a cat?
      }

      int catDefault = 1;  //  default mouse win, try to update this number to 2 or 0
      for (int catGo : catGoList) {
        if (catGo == 0) {
          continue;  // cannot go to hole
        }
        int next = helper(graph, mouseGo, catGo, dp);
        if (next == 2) {   // if cat win in this path, no need to continue
          catDefault = 2;
          break;
        }
        if (next == 0) {   // at least it's a draw
          catDefault = 0;
        }
      }
      if (catDefault == 1) {  // if mouse can win in this path, no need to continue
        mouseDefault = 1;
        break;
      }
      if (catDefault == 0) {  // at least it's a draw
        mouseDefault = 0;
      }
    }
    dp[mouse][cat] = mouseDefault;
    return dp[mouse][cat];
  }
}
