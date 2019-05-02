package com.leetcode.algorithm.medium.sentencesimilarityii;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
//  public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
//    if (words1.length != words2.length) {
//      return false;
//    }
//
//    Map<String, Set<String>> map = new HashMap<>();
//    for (String[] p : pairs) {
//      if (!map.containsKey(p[0])) {
//        map.put(p[0], new HashSet<>());
//      }
//      map.get(p[0]).add(p[1]);
//      if (!map.containsKey(p[1])) {
//        map.put(p[1], new HashSet<>());
//      }
//      map.get(p[1]).add(p[0]);
//    }
//
//    for (int i = 0; i < words1.length; i++) {
//      if (words1[i].equals(words2[i])) {
//        continue;
//      }
//
//      if (!map.containsKey(words1[i]) || !map.containsKey(words2[i])) {
//        return false;
//      } else if (!dfs(words1[i], words2[i], map, new HashSet<>())) {
//        return false;
//      }
//    }
//
//    return true;
//  }
//
//  private boolean dfs(String start, String end, Map<String, Set<String>> map, Set<String> visited) {
//    if (start.equals(end)) {
//      return true;
//    }
//
//    if (visited.add(start)) {
//      for (String s : map.get(start)) {
//        if (!visited.contains(s)) {
//          boolean ans = dfs(s, end, map, visited);
//          if (ans) {
//            return true;
//          }
//        }
//      }
//    }
//
//    return false;
//  }

  public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
    if (words1.length != words2.length) {
      return false;
    }

    Map<String, String> map = new HashMap<>();
    for (String[] p: pairs) {
      String parent1 = find(map, p[0]);
      String parent2 = find(map, p[1]);
      if (!parent1.equals(parent2)) {
        map.put(parent1, parent2);
      }
    }

    for (int i = 0; i < words1.length; i++) {
      if (words1[i].equals(words2[i])) {
        continue;
      }

      String parent1 = find(map, words1[i]);
      String parent2 = find(map, words2[i]);
      if (!parent1.equals(parent2)) {
        return false;
      }
    }

    return true;
  }

  private String find(Map<String, String> map, String word) {
    if (!map.containsKey(word)) {
      map.put(word, word);
    }

    return map.get(word).equals(word) ? word : find(map, map.get(word));
  }
}
