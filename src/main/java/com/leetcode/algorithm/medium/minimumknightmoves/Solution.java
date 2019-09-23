package com.leetcode.algorithm.medium.minimumknightmoves;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
  public int minKnightMoves(int x, int y) {
    x = Math.abs(x);
    y = Math.abs(y);
    Queue<int[]> queue = new LinkedList<>();
    Set<String> visited = new HashSet<>();
    queue.add(new int[] {0, 0});
    visited.add(0 + "," + 0);
    int ans = 0;
    int[][] dirs =
        new int[][] {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, -1}, {2, 1}, {1, 2}};
    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        int[] item = queue.poll();
        if (item[0] == x && item[1] == y) {
          return ans;
        }

        for (int[] d : dirs) {
          int row = item[0] + d[0];
          int col = item[1] + d[1];
          if (row >= -2 && col >= -2 && !visited.contains(row + "," + col)) {
            queue.offer(new int[] {row, col});
            visited.add(row + "," + col);
          }
        }
      }
      ans++;
    }

    return -1;
  }
}
