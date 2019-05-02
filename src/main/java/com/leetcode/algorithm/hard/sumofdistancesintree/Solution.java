package com.leetcode.algorithm.hard.sumofdistancesintree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  int[] res;
  int[] count;
  List<Set<Integer>> tree;

  public int[] sumOfDistancesInTree(int n, int[][] edges) {
    tree = new ArrayList<>();
    res = new int[n];
    count = new int[n];
    for (int i = 0; i < n; i++) {
      tree.add(new HashSet<>());
    }

    for (int[] e: edges) {
      tree.get(e[0]).add(e[1]);
      tree.get(e[1]).add(e[0]);
    }

    dfs(0, - 1);
    dfs2(0, -1);

    return res;
  }

  private void dfs(int node, int parent) {
    for (int i: tree.get(node)) {
      if (i == parent) {
        continue;
      }

      dfs(i, node);
      count[node] += count[i];
      res[node] += res[i] + count[i];
    }

    count[node]++;
  }

  private void dfs2(int node, int pre) {
    for (int i: tree.get(node)) {
      if (i == pre) {
        continue;
      }
      res[i] = res[node] - count[i] + count.length - count[i];
      dfs2(i, node);
    }
  }
}
