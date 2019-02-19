package com.leetcode.algorithm.easy.networkdelaytime;

import java.util.*;

class Solution {
  public int networkDelayTime(int[][] times, int n, int k) {
    Map<Integer, List<int[]>> graph = new HashMap<>();
    for (int[] edge: times) {
      if (!graph.containsKey(edge[0])) {
        graph.put(edge[0], new ArrayList<>());
      }
      graph.get(edge[0]).add(new int[] {edge[1], edge[2]});
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((node1, node2) -> node1[0] - node2[0]);
    pq.offer(new int[] {0, k});

    Map<Integer, Integer> dist = new HashMap();

    while (!pq.isEmpty()) {
      int[] node = pq.poll();
      int d = node[0];
      int id = node[1];
      if (dist.containsKey(id)) {
        continue;
      }

      dist.put(id, d);
      if (graph.containsKey(id)) {
        for (int[] edge: graph.get(id)) {
          int nei = edge[0];
          int d2 = edge[1];
          if (!dist.containsKey(nei)) {
            pq.offer(new int[] {d + d2, nei});
          }
        }
      }
    }

    if (dist.size() != n) {
      return -1;
    }

    int ans = 0;
    for (int num: dist.values()) {
      ans = Math.max(ans, num);
    }
    return ans;
  }
}
