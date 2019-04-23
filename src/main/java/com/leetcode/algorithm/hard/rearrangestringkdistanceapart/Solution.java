package com.leetcode.algorithm.hard.rearrangestringkdistanceapart;

import java.util.*;

class Solution {
  public String rearrangeString(String s, int k) {
    StringBuilder sb = new StringBuilder();
    Map<Character, Integer> map = new HashMap<>();
    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
    pq.addAll(map.entrySet());

    Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();

    while (!pq.isEmpty()) {
      Map.Entry<Character, Integer> entry = pq.poll();
      sb.append(entry.getKey());
      entry.setValue(entry.getValue() - 1);
      waitQueue.offer(entry);

      if (waitQueue.size() < k) {
        continue;
      }

      Map.Entry<Character, Integer> front = waitQueue.poll();
      if (front.getValue() > 0) {
        pq.offer(front);
      }
    }

    return sb.length() == s.length() ? sb.toString() : "";
  }
}
