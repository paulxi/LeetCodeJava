package com.leetcode.algorithm.medium.openthelock;

import java.util.*;

class Solution {
  public int openLock(String[] deadends, String target) {
    Set<String> set = new HashSet<>(Arrays.asList(deadends));
    if (set.contains("0000") || set.contains(target)) {
      return -1;
    }

    Set<String> visited = new HashSet<>();
    visited.add("0000");

    Queue<String> queue = new LinkedList<>();
    queue.offer("0000");
    int ans = 0;

    while (!queue.isEmpty()) {
      ans++;

      int size = queue.size();
      for (int i = 0; i < size; i++) {
        String str = queue.poll();

        for (int j = 0; j < str.length(); j++) {
          int value = str.charAt(j) - '0' + 10;
          int[] nei = new int[] { (value + 1) % 10, (value - 1) % 10};

          for (int v : nei) {
            String next = str.substring(0, j) + v + str.substring(j + 1);

            if (set.contains(next) || visited.contains(next)) {
              continue;
            }

            if (next.equals(target)) {
              return ans;
            }

            queue.offer(next);
            visited.add(next);
          }
        }
      }
    }

    return -1;
  }
}
