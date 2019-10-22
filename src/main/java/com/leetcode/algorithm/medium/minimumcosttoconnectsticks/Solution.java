package com.leetcode.algorithm.medium.minimumcosttoconnectsticks;

import java.util.PriorityQueue;

class Solution {
  public int connectSticks(int[] sticks) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int s: sticks) {
      pq.offer(s);
    }

    int sum = 0;
    while (pq.size() > 1) {
      int two = pq.poll() + pq.poll();
      sum += two;
      pq.offer(two);
    }
    return sum;
  }
}
