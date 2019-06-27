package com.leetcode.algorithm.medium.campusbikes;

import java.util.*;

class Solution {
  public int[] assignBikes(int[][] workers, int[][] bikes) {
    int n = workers.length;

    PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
      int comp = Integer.compare(a[0], b[0]);
      if (comp == 0) {
        if (a[1] == b[1]) {
          return Integer.compare(a[2], b[2]);
        }

        return Integer.compare(a[1], b[1]);
      }
      return comp;
    });

    for (int i = 0; i < workers.length; i++) {
      int[] worker = workers[i];

      for (int j = 0; j < bikes.length; j++) {
        int[] bike = bikes[j];
        int dist = Math.abs(bike[0] - worker[0]) + Math.abs(bike[1] - worker[1]);
        queue.offer(new int[] {dist, i, j});
      }
    }

    int[] res = new int[n];
    Arrays.fill(res, -1);
    Set<Integer> visited = new HashSet<>();
    while (visited.size() < n) {
      int[] temp = queue.poll();
      if (res[temp[1]] == -1 && !visited.contains(temp[2])) {
        res[temp[1]] = temp[2];
        visited.add(temp[2]);
      }
    }

    return res;
  }
}
