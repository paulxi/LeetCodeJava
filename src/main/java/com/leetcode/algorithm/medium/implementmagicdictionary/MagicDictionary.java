package com.leetcode.algorithm.medium.implementmagicdictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MagicDictionary {
  Map<String, List<int[]>> map = new HashMap<>();

  /** Initialize your data structure here. */
  public MagicDictionary() {

  }

  /** Build a dictionary through a list of words */
  public void buildDict(String[] dict) {
    for (String s: dict) {
      for (int i = 0; i < s.length(); i++) {
        String key = s.substring(0, i) + s.substring(i + 1);
        int[] pair = new int[] {i, s.charAt(i)};
        if (!map.containsKey(key)) {
          map.put(key, new ArrayList<>());
        }

        map.get(key).add(pair);
      }
    }
  }

  /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
  public boolean search(String word) {
    for (int i = 0; i < word.length(); i++) {
      String key = word.substring(0, i) + word.substring(i + 1);
      if (map.containsKey(key)) {
        for (int[] pair: map.get(key)) {
          if (pair[0] == i && pair[1] != word.charAt(i)) {
            return true;
          }
        }
      }
    }

    return false;
  }
}
