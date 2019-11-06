package com.leetcode.algorithm.medium.pathwithmaximumminimumvalue;

import java.util.PriorityQueue;

class Solution {
  public int maximumMinimumPath(int[][] arr) {
    int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
    pq.offer(new int[]{arr[0][0], 0, 0});
    int maxscore = arr[0][0];
    arr[0][0] = -1;
    while (!pq.isEmpty()) {
      int[] item = pq.poll();
      int i = item[1];
      int j = item[2];
      maxscore = Math.min(maxscore, item[0]);
      if (i == arr.length - 1 && j == arr[0].length - 1) {
        return maxscore;
      }

      for (int[] d: dirs) {
        int x = i + d[0];
        int y = j + d[1];

        if (x >= 0 && x < arr.length && y >= 0 && y < arr[0].length && arr[x][y] >= 0) {
          pq.offer(new int[] {arr[x][y], x, y});
          arr[x][y] = -1;
        }
      }
    }

    return -1;
  }
}
