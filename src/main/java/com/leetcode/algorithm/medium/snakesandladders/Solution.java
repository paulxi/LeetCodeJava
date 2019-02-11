package com.leetcode.algorithm.medium.snakesandladders;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
  public int snakesAndLadders(int[][] board) {
    int n = board.length;

    Map<Integer, Integer> dist = new HashMap<>();
    dist.put(1, 0);

    Queue<Integer> queue = new LinkedList<>();
    queue.offer(1);

    while (!queue.isEmpty()) {
      int s = queue.poll();
      if (s == n * n) return dist.get(s);

      for (int s2 = s + 1; s2 <= Math.min(s + 6, n * n); ++s2) {
        int rc = get(s2, n);
        int r = rc / n;
        int c = rc % n;
        int s2Final = board[r][c] == -1 ? s2 : board[r][c];
        if (!dist.containsKey(s2Final)) {
          dist.put(s2Final, dist.get(s) + 1);
          queue.offer(s2Final);
        }
      }
    }

    return -1;
  }

  private int get(int s, int n) {
    int quot = (s - 1) / n;
    int rem = (s - 1) % n;
    int row = n - 1 - quot;
    int col = row % 2 != n % 2 ? rem : n - 1 - rem;
    return row * n + col;
  }
}
