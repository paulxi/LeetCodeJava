package com.leetcode.algorithm.medium.topkfrequentwords;

import java.util.*;

class Solution {
  public List<String> topKFrequent(String[] words, int k) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String word: words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    PriorityQueue<String> queue = new PriorityQueue<>((s1, s2) -> {
      int c1 = map.getOrDefault(s1, 0);
      int c2 = map.getOrDefault(s2, 0);
      if (c1 == c2) {
        return s2.compareTo(s1);
      } else {
        return Integer.compare(c1, c2);
      }
    });

    for (String key: map.keySet()) {
      queue.offer(key);
      if (queue.size() > k) {
        queue.poll();
      }
    }

    ArrayList<String> result = new ArrayList<>();
    while (!queue.isEmpty()) {
      result.add(queue.poll());
    }
    Collections.reverse(result);
    return result;
  }
}
