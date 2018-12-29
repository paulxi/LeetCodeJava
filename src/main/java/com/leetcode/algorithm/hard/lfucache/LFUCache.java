package com.leetcode.algorithm.hard.lfucache;

import java.util.HashMap;
import java.util.LinkedHashSet;

class LFUCache {
  HashMap<Integer, Integer> vals;
  HashMap<Integer, Integer> counts;
  HashMap<Integer, LinkedHashSet<Integer>> lists;
  int cap;
  int min = -1;

  public LFUCache(int capacity) {
    this.cap = capacity;
    vals = new HashMap<>();
    counts = new HashMap<>();
    lists = new HashMap<>();
  }

  public int get(int key) {
    if (!vals.containsKey(key)) {
      return -1;
    }

    int count = counts.get(key);
    counts.put(key, count + 1);
    lists.get(count).remove(key);
    if (count == min && lists.get(count).size() == 0) {
      min++;
    }

    if (!lists.containsKey(count + 1)) {
      lists.put(count + 1, new LinkedHashSet<>());
    }
    lists.get(count + 1).add(key);
    return vals.get(key);
  }

  public void put(int key, int value) {
    if (cap <= 0) {
      return;
    }

    if (vals.containsKey(key)) {
      vals.put(key, value);
      get(key);
      return;
    }
    if (vals.size() >= cap) {
      int evit = lists.get(min).iterator().next();
      lists.get(min).remove(evit);
      vals.remove(evit);
      counts.remove(evit);
    }

    vals.put(key, value);
    counts.put(key, 1);
    min = 1;
    if (!lists.containsKey(1)) {
      lists.put(1, new LinkedHashSet<>());
    }
    lists.get(1).add(key);
  }
}
