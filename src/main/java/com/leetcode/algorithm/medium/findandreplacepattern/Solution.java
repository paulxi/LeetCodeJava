package com.leetcode.algorithm.medium.findandreplacepattern;

import java.util.*;

class Solution {
  public List<String> findAndReplacePattern(String[] words, String pattern) {
    int[] p = normalize(pattern);
    List<String> res = new ArrayList<>();
    for (String word : words) {
      if (Arrays.equals(normalize(word), p)) {
        res.add(word);
      }
    }

    return res;
  }

  private int[] normalize(String word) {
    Map<Character, Integer> map = new HashMap<>();
    int n = word.length();
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      map.putIfAbsent(word.charAt(i), map.size());
      res[i] = map.get(word.charAt(i));
    }
    return res;
  }
}
