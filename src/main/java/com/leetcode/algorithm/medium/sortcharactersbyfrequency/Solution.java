package com.leetcode.algorithm.medium.sortcharactersbyfrequency;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public String frequencySort(String s) {
    if (s == null) {
      return null;
    }

    HashMap<Character, Integer> map = new HashMap<>();
    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    Character[] chars = new Character[map.keySet().size()];
    map.keySet().toArray(chars);

    Arrays.sort(chars, (Character a, Character b) -> map.get(b).compareTo(map.get(a)));

    StringBuilder sb = new StringBuilder();
    for (char c: chars) {
      for (int i = 0; i < map.get(c); i++) {
        sb.append(c);
      }
    }

    return sb.toString();
  }
}
