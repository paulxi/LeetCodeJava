package com.leetcode.algorithm.hard.wordpatternii;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public boolean wordPatternMatch(String pattern, String str) {
    Map<Character, String> map = new HashMap<>();
    Set<String> set = new HashSet<>();

    return isMatch(str, 0, pattern, 0, map, set);
  }

  private boolean isMatch(String str, int i, String pat, int j, Map<Character, String> map, Set<String> set) {
    if (str.length() == i && pat.length() == j) {
      return true;
    }

    if (str.length() == i || pat.length() == j) {
      return false;
    }

    char c = pat.charAt(j);
    if (map.containsKey(c)) {
      String s = map.get(c);
      if (!str.startsWith(s, i)) {
        return false;
      }

      return isMatch(str, i + s.length(), pat, j + 1, map, set);
    }

    for (int k = i; k < str.length(); k++) {
      String p = str.substring(i, k + 1);

      if (set.contains(p)) {
        continue;
      }

      map.put(c, p);
      set.add(p);

      if (isMatch(str, k + 1, pat, j + 1, map, set)) {
        return true;
      }

      map.remove(c);
      set.remove(p);
    }

    return false;
  }
}
