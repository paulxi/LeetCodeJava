package com.leetcode.algorithm.easy.laststoneweight;

import java.util.PriorityQueue;

class Solution {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    for (int s: stones) {
      pq.offer(s);
    }

    while (pq.size() > 1) {
      int v1 = pq.poll();
      int v2 = pq.poll();

      if (v1 - v2 != 0) {
        pq.offer(v1 - v2);
      }
    }

    return pq.isEmpty() ? 0 : pq.poll();
  }
}
