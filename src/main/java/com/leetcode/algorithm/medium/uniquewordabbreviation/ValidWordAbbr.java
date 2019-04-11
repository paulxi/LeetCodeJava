package com.leetcode.algorithm.medium.uniquewordabbreviation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ValidWordAbbr {
  Map<String, Integer> map = new HashMap<>();
  Set<String> set = new HashSet<>();

  public ValidWordAbbr(String[] dictionary) {
    for (String word: dictionary) {
      if (!set.contains(word)) {
        set.add(word);
        String abbr = abbr(word);
        map.put(abbr, map.getOrDefault(abbr, 0) + 1);
      }
    }
  }

  public boolean isUnique(String word) {
    String abbr = abbr(word);
    if (set.contains(word)) {
      return map.get(abbr) == 1;
    } else {
      return map.getOrDefault(abbr, 0) == 0;
    }
  }

  private String abbr(String word) {
    int len = word.length();
    if (len > 2) {
      return word.substring(0, 1) + (len - 2) + word.substring(len - 1);
    } else {
      return word;
    }
  }
}
