package com.leetcode.algorithm.hard.busroutes;

import java.util.*;

class Solution {
  public int numBusesToDestination(int[][] routes, int s, int t) {
    HashSet<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    int ans = 0;

    if (s == t) {
      return 0;
    }

    for (int i = 0; i < routes.length; i++) {
      for (int j = 0; j < routes[i].length; j++) {
        List<Integer> buses = map.getOrDefault(routes[i][j], new ArrayList<>());
        buses.add(i);
        map.put(routes[i][j], buses);
      }
    }

    queue.offer(s);
    while (!queue.isEmpty()) {
      int len = queue.size();
      ans++;
      for (int i = 0; i < len; i++) {
        int cur = queue.poll();
        List<Integer> buses = map.get(cur);
        for (int bus: buses) {
          if (visited.contains(bus)) {
            continue;
          }

          visited.add(bus);
          for (int j = 0; j < routes[bus].length; j++) {
            if (routes[bus][j] == t) {
              return ans;
            }
            queue.offer(routes[bus][j]);
          }
        }
      }
    }

    return -1;
  }
}
