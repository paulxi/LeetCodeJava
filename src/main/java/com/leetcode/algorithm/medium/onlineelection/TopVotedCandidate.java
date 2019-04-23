package com.leetcode.algorithm.medium.onlineelection;

import java.util.TreeMap;

class TopVotedCandidate {
  private TreeMap<Integer, Integer> map = new TreeMap<>();

  public TopVotedCandidate(int[] persons, int[] times) {
    int[] count = new int[persons.length];
    for (int i = 0, max = -1; i < times.length; i++) {
      count[persons[i]]++;
      if (max <= count[persons[i]]) {
        max = count[persons[i]];
        map.put(times[i], persons[i]);
      }
    }
  }

  public int q(int t) {
    return map.floorEntry(t).getValue();
  }
}
