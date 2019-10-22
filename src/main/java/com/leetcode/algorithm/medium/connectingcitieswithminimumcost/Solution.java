package com.leetcode.algorithm.medium.connectingcitieswithminimumcost;

import java.util.Arrays;

class Solution {
  private int[] parents;
  private int num;

  private boolean union(int x, int y) {
    int px = find(x);
    int py = find(y);
    if (px != py) {
      parents[px] = py;
      num--;
      return true;
    }

    return false;
  }

  private int find(int x) {
    if (parents[x] == x) {
      return parents[x];
    }
    parents[x] = find(parents[x]);
    return parents[x];
  }

  public int minimumCost(int n, int[][] connections) {
    parents = new int[n + 1];
    num = n;
    for (int i = 0; i <= n; i++) {
      parents[i] = i;
    }

    Arrays.sort(connections, (a, b) -> a[2] - b[2]);
    int res = 0;
    for (int [] c: connections) {
      int x = c[0];
      int y = c[1];
      if (union(x, y)) {
        res += c[2];
      }
    }
    return num == 1 ? res : -1;
  }
}
