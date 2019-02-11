package com.leetcode.algorithm.medium.reorganizestring;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
  public String reorganizeString(String s) {
    if (s == null || s.length() == 0) {
      return "";
    }

    Map<Character, Integer> map = new HashMap<>();
    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0)+ 1);
    }
    PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue());
    pq.addAll(map.entrySet());

    StringBuilder sb = new StringBuilder();
    while (pq.size() >= 2) {
      Map.Entry<Character, Integer> first = pq.poll();
      Map.Entry<Character, Integer> second = pq.poll();

      sb.append(first.getKey());
      sb.append(second.getKey());

      if (first.getValue() > 1) {
        first.setValue(first.getValue() - 1);
        pq.offer(first);
      }
      if (second.getValue() > 1) {
        second.setValue(second.getValue() - 1);
        pq.offer(second);
      }
    }

    if (pq.size() > 0) {
      sb.append(pq.poll().getKey());
    }

    return sb.length() == s.length() ? sb.toString() : "";
  }
}
