package com.leetcode.algorithm.hard.swiminrisingwater;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
  public int swimInWater(int[][] grid) {
    int m = grid.length;

    int ans = 0;
    Set<Integer> seen = new HashSet<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>((k1, k2) -> grid[k1/m][k1 % m] - grid[k2/m][k2%m]);
    pq.offer(0);
    seen.add(0);

    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    while (!pq.isEmpty()) {
      int pos = pq.poll();
      int posX = pos / m;
      int posY = pos % m;
      ans = Math.max(ans, grid[posX][posY]);

      if (posX == m - 1 && posY == m - 1) {
        return ans;
      }

      for (int[] dir: dirs) {
        int x = dir[0] + posX;
        int y = dir[1] + posY;

        if (x >= 0 && x < m && y >= 0 && y < m && !seen.contains(x * m + y)) {
          pq.offer(x * m + y);
          seen.add(x * m + y);
        }
      }
    }

    return -1;
  }
}
