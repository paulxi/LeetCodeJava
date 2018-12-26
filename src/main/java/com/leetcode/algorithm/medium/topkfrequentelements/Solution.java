package com.leetcode.algorithm.medium.topkfrequentelements;

import java.util.*;

class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num: nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>((Integer a, Integer b) -> map.get(a) - map.get(b));
    for (int num: map.keySet()) {
      heap.add(num);
      if (heap.size() > k) {
        heap.poll();
      }
    }

    List<Integer> result = new ArrayList<>();
    while (!heap.isEmpty()) {
      result.add(heap.poll());
    }
    Collections.reverse(result);
    return result;
  }
}
