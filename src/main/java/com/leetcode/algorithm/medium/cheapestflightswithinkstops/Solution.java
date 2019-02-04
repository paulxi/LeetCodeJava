package com.leetcode.algorithm.medium.cheapestflightswithinkstops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
//  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
//    int INF = Integer.MAX_VALUE / 2;
//    int[][] dp = new int[2][n];
//    Arrays.fill(dp[0], INF);
//    Arrays.fill(dp[1], INF);
//    dp[0][src] = dp[1][src] = 0;
//
//    for (int i = 0; i <= k; i++) {
//      for (int[] edge: flights) {
//        dp[i & 1][edge[1]] = Math.min(dp[i & 1][edge[1]], dp[~i & 1][edge[0]] + edge[2]);
//      }
//    }
//
//    return dp[k & 1][dst] < INF ? dp[k & 1][dst] : -1;
//  }

  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    for (int[] flight: flights) {
      if (!map.containsKey(flight[0])) {
        map.put(flight[0], new HashMap<>());
      }

      map.get(flight[0]).put(flight[1], flight[2]);
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    pq.offer(new int[]{0, src, k + 1});
    while (!pq.isEmpty()) {
      int[] item = pq.poll();
      int price = item[0];
      int city = item[1];
      int stops = item[2];

      if (city == dst) {
        return price;
      }

      if (stops > 0) {
        Map<Integer, Integer> adj = map.getOrDefault(city, new HashMap<>());
        for (Integer a: adj.keySet()) {
          pq.offer(new int[] {adj.get(a) + price, a, stops - 1});
        }
      }
    }

    return -1;
  }
}
