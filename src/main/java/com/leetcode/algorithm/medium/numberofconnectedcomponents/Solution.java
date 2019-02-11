package com.leetcode.algorithm.medium.numberofconnectedcomponents;

class Solution {
  static class UnionFind {
    private int[] parents;
    private int count;

    public UnionFind(int n) {
      parents = new int[n];
      for (int i = 0; i < n; i++) {
        parents[i] = i;
      }

      count = n;
    }

    public int find(int x) {
      if (x != parents[x]) {
        parents[x] = find(parents[x]);
      }

      return parents[x];
    }

    public boolean union(int x, int y) {
      int px = find(x);
      int py = find(y);

      if (px != py) {
        parents[py] = px;
        count--;
        return true;
      } else {
        return false;
      }
    }

    public int getCount() {
      return count;
    }
  }

  public int countComponents(int n, int[][] edges) {
    UnionFind uf = new UnionFind(n);
    for (int[] edge: edges) {
      uf.union(edge[0], edge[1]);
    }

    return uf.getCount();
  }
}
