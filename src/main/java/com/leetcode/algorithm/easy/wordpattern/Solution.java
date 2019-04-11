package com.leetcode.algorithm.easy.wordpattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public boolean wordPattern(String pattern, String str) {
    Map<Character, String> map = new HashMap<>();
    Set<String> set = new HashSet();

    String[] strs = str.split(" ");
    if (strs.length != pattern.length()) {
      return false;
    }

    for (int i = 0; i < strs.length; i++) {
      char c = pattern.charAt(i);
      if (!map.containsKey(c)) {
        if (set.contains(strs[i])) {
          return false;
        }
        map.put(c, strs[i]);
        set.add(strs[i]);
      } else {
        if (!map.get(c).equals(strs[i])) {
          return false;
        }
      }
    }

    return true;
  }
}
