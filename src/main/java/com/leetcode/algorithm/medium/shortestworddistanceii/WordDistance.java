package com.leetcode.algorithm.medium.shortestworddistanceii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class WordDistance {
  HashMap<String, List<Integer>> map = new HashMap<>();

  public WordDistance(String[] words) {
    for (int i = 0; i < words.length; i++) {
      List<Integer> list = map.get(words[i]);
      if (list == null) {
        list = new ArrayList<>();
        map.put(words[i], list);
      }
      list.add(i);
    }
  }

  public int shortest(String word1, String word2) {
    List<Integer> list1 = map.get(word1);
    List<Integer> list2 = map.get(word2);
    int min = Integer.MAX_VALUE;
    for (int i: list1) {
      for (int j: list2) {
        min = Math.min(min, Math.abs(i - j));
      }
    }
    return min;
  }
}
