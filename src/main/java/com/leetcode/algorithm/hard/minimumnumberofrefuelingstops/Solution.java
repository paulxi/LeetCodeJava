package com.leetcode.algorithm.hard.minimumnumberofrefuelingstops;

import java.util.PriorityQueue;

class Solution {
  public int minRefuelStops(int target, int startFuel, int[][] stations) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int i = 0;
    int res = 0;
    int cur = startFuel;
    while (cur < target) {
      while (i < stations.length && stations[i][0] <= cur) {
        pq.offer(-stations[i][1]);
        i++;
      }
      if (pq.isEmpty()) {
        return -1;
      }
      cur += -pq.poll();
      res++;
    }

    return res;
  }
}
