package com.leetcode.algorithm.medium.mapsumpairs;

import java.util.HashMap;
import java.util.Map;

public class MapSum {
  private class Trie {
    int val;
    Map<Character, Trie> children;

    Trie() {
      children = new HashMap<>();
    }
  }

  Trie root;

  /** Initialize your data structure here. */
  public MapSum() {
    root = new Trie();
  }

  public void insert(String key, int val) {
    Trie curr = root;
    for (char c: key.toCharArray()) {
      Trie t = curr.children.get(c);
      if (t == null) {
        t = new Trie();
        curr.children.put(c, t);
      }
      curr = t;
    }

    curr.val = val;
  }

  public int sum(String prefix) {
    Trie curr = root;
    for (char c: prefix.toCharArray()) {
      Trie t = curr.children.get(c);
      if (t == null) {
        return 0;
      }
      curr = t;
    }
    int[] result = new int[1];
    traverse(curr, result);

    return result[0];
  }

  private void traverse(Trie t, int[] result) {
    result[0] += t.val;

    for(Trie trie: t.children.values()) {
      traverse(trie, result);
    }
  }
}
