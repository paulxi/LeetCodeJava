package com.leetcode.algorithm.easy.highfive;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
  public int[][] highFive(int[][] items) {
    Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
    for (int[] item: items) {
      if (!map.containsKey(item[0])) {
        map.put(item[0], new PriorityQueue<>());
      }

      map.get(item[0]).add(item[1]);
      if (map.get(item[0]).size() > 5) {
        map.get(item[0]).poll();
      }
    }

    int[][] ans = new int[map.size()][2];
    for (int key: map.keySet()) {
      PriorityQueue<Integer> pq = map.get(key);
      int sum = 0;
      int size = pq.size();
      while (!pq.isEmpty()) {
        sum += pq.poll();
      }

      int[] score = new int[] {key, sum / size};
      ans[key - 1] = score;
    }

    return ans;
  }
}
