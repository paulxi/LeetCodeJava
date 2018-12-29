package com.leetcode.algorithm.medium.redundantconnection;

class Solution {
  static class DSU {
    int[] parent;
    int[] rank;

    DSU(int size) {
      parent = new int[size];
      for (int i = 0; i < size;i++) {
        parent[i] = i;
      }
      rank = new int[size];
    }

    int find(int x) {
      if (parent[x] != x) {
        parent[x] = find(parent[x]);
      }

      return parent[x];
    }

    boolean union(int x, int y) {
      int xr = find(x);
      int yr = find(y);
      if (xr == yr) {
        return false;
      }

      if (rank[xr] < rank[yr]) {
        parent[xr] = yr;
      } else if (rank[xr] > rank[yr]) {
        parent[yr] = xr;
      } else {
        parent[yr] = xr;
        rank[xr]++;
      }

      return true;
    }
  }

  public int[] findRedundantConnection(int[][] edges) {
    DSU dsu = new DSU(1001);
    for (int[] edge: edges) {
      if (!dsu.union(edge[0], edge[1])) {
        return edge;
      }
    }

    return null;
  }
}
