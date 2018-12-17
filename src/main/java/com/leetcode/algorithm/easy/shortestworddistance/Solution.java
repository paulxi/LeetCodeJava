package com.leetcode.algorithm.easy.shortestworddistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
//  public int shortestDistance(String[] words, String word1, String word2) {
//    HashMap<String, List<Integer>> map = new HashMap<>();
//    for (int i = 0; i < words.length; i++) {
//      String word = words[i];
//      List<Integer> list = map.get(word);
//      if (list == null) {
//        list = new ArrayList<>();
//        map.put(word, list);
//      }
//      list.add(i);
//    }
//
//    int min = Integer.MAX_VALUE;
//    for (int pos1: map.get(word1)) {
//      for (int pos2: map.get(word2)) {
//        min = Math.min(min, Math.abs(pos1 - pos2));
//      }
//    }
//
//    return min;
//  }

  public int shortestDistance(String[] words, String word1, String word2) {
    int pos1 = -1;
    int pos2 = -1;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(word1)) {
        pos1 = i;
      } else if (words[i].equals(word2)) {
        pos2 = i;
      }

      if (pos1 != -1 && pos2 != -1) {
        min = Math.min(min, Math.abs(pos1 - pos2));
      }
    }

    return min;
  }
}
