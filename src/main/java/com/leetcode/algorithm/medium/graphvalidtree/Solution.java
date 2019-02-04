package com.leetcode.algorithm.medium.graphvalidtree;

class Solution {
  public boolean validTree(int n, int[][] edges) {
    int[] parents = new int[n];
    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }

    for (int i = 0; i < edges.length; i++) {
      int x = find(parents, edges[i][0]);
      int y = find(parents, edges[i][1]);

      if (x == y) {
        return false;
      }

      parents[x] = y;
    }

    return edges.length == n - 1;
  }

  private int find(int[] parents, int x) {
    if (parents[x] != x) {
      parents[x] = find(parents, parents[x]);
    }

    return parents[x];
  }
}
