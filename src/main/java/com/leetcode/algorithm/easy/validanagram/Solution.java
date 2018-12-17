package com.leetcode.algorithm.easy.validanagram;

import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    if (s == null || t == null) {
      return false;
    }
    HashMap<Character, Integer> sMap = makeMap(s);
    HashMap<Character, Integer> tMap = makeMap(t);

    return sMap.equals(tMap);
  }

  private HashMap<Character, Integer> makeMap(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c: str.toCharArray()) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }

    return map;
  }
}
