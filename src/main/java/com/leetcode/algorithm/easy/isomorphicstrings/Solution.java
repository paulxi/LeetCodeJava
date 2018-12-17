package com.leetcode.algorithm.easy.isomorphicstrings;

import java.util.HashMap;

class Solution {
  public boolean isIsomorphic(String s, String t) {
    if (s == null || t == null) {
      return false;
    }
    if (s.length() != t.length()) {
      return false;
    }

    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    HashMap<Character, Character> map = new HashMap<>();

    for (int i = 0; i < sChars.length; i++) {
      if (map.containsKey(sChars[i]) && map.get(sChars[i]) != tChars[i]) {
        return false;
      }

      if (!map.containsKey(sChars[i]) && map.containsValue(tChars[i])) {
        return false;
      }

      if (!map.containsKey(sChars[i]) && !map.containsValue(tChars[i])) {
        map.put(sChars[i], tChars[i]);
      }
    }

    return true;
  }
}
