package com.leetcode.algorithm.hard.cutofftreesforgolfevent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
  public int cutOffTree(List<List<Integer>> forest) {
    List<int[]> trees = new ArrayList<>();
    for (int i = 0; i < forest.size(); i++) {
      List<Integer> cols = forest.get(i);
      for (int j = 0; j < cols.size(); j++) {
        if (cols.get(j) > 1) {
          trees.add(new int[] {cols.get(j), i, j});
        }
      }
    }

    trees.sort((a, b) -> a[0] - b[0]);

    int ans = 0;
    int sr = 0;
    int sc = 0;

    for (int[] tree: trees) {
      int d = dist(tree, sr, sc, forest);
      if (d == -1) {
        return -1;
      }
      ans += d;

      sr = tree[1];
      sc = tree[2];
    }

    return ans;
  }

  private int dist(int[] tree, int sr, int sc, List<List<Integer>> forest) {
    int[][] move = new int[][] {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };
    int m = forest.size();
    int n = forest.get(0).size();

    boolean[][] seen = new boolean[m][n];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {0, sr, sc});

    while (!queue.isEmpty()) {
      int[] cur = queue.poll();
      if (cur[1] == tree[1] && cur[2] == tree[2]) {
        return cur[0];
      }

      for (int i = 0; i < move.length; i++) {
        int r = cur[1] + move[i][0];
        int c = cur[2] + move[i][1];

        if (r >= 0 && r < m && c >= 0 && c < n && !seen[r][c] && forest.get(r).get(c) > 0) {
          queue.offer(new int[] {cur[0] + 1, r, c});
          seen[r][c] = true;
        }
      }
    }
    return -1;
  }
}
