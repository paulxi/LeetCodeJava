package com.leetcode.algorithm.medium.makingalargeisland;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
  int n = 0;

  public int largestIsland(int[][] grid) {
    n = grid.length;

    int index = 3;
    int res = 0;
    HashMap<Integer, Integer> area = new HashMap<>();
    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {
        if (grid[x][y] == 1) {
          area.put(index, dfs(grid, x, y, index));
          res = Math.max(res, area.get(index));
          index++;
        }
      }
    }

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {
        if (grid[x][y] == 0) {
          HashSet<Integer> seen = new HashSet<>();
          int cur = 1;
          for (Pair p : move(x, y)) {
            index = grid[p.x][p.y];
            if (index > 1 && !seen.contains(index)) {
              seen.add(index);
              cur += area.get(index);
            }
          }
          res = Math.max(res, cur);
        }
      }
    }
    return res;
  }

  private List<Pair> move(int x, int y) {
    ArrayList<Pair> res = new ArrayList<>();
    if (isValid(x, y + 1)) {
      res.add(new Pair(x, y + 1));
    }
    if (isValid(x, y - 1)) {
      res.add(new Pair(x, y - 1));
    }
    if (isValid(x + 1, y)) {
      res.add(new Pair(x + 1, y));
    }
    if (isValid(x - 1, y)) {
      res.add(new Pair(x - 1, y));
    }

    return res;
  }

  private boolean isValid(int x, int y) {
    return 0 <= x && x < n && 0 <= y && y < n;
  }

  private int dfs(int[][] grid, int x, int y, int index) {
    int area = 0;
    grid[x][y] = index;
    for (Pair p : move(x, y)) {
      if (grid[p.x][p.y] == 1) {
        area += dfs(grid, p.x, p.y, index);
      }
    }

    return area + 1;
  }

  private static class Pair {
    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
