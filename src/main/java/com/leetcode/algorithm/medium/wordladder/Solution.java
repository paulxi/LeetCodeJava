package com.leetcode.algorithm.medium.wordladder;

import java.util.HashSet;
import java.util.List;

class Solution {
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    HashSet<String> remained = new HashSet<>(wordList);
    HashSet<String> reached = new HashSet<>();
    reached.add(beginWord);

    int distance = 1;
    while (!remained.isEmpty() && !reached.isEmpty()) {
      if (reached.contains(endWord)) {
        return distance;
      }

      remained.removeAll(reached);

      distance += 1;

      HashSet<String> children = new HashSet<>();
      for (String word : reached) {
        for (String str : remained) {
          if (!children.contains(str) && isOneLetterDiff(word, str)) {
            children.add(str);
          }
        }
      }

      reached = children;
    }

    return 0;
  }

  private boolean isOneLetterDiff(String src, String dist) {
    for (int i = 0; i < src.length(); i++) {
      if (src.charAt(i) != dist.charAt(i)) {
        return src.substring(i + 1).equals(dist.substring(i + 1));
      }
    }

    return false;
  }
}
