package com.leetcode.algorithm.medium.kthmostfrequent;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
  public int findKthMost(int[] nums, int kth) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num: nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));
    for (int num: map.keySet()) {
      if (pq.size() < kth) {
        pq.offer(num);
      } else {
        if (map.get(num) > map.get(pq.peek())) {
          pq.offer(num);
          pq.poll();
        }
      }
    }

    return pq.peek();
  }
}
