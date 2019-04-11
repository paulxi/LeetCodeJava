package com.leetcode.algorithm.medium.groupshiftedstrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<List<String>> groupStrings(String[] strings) {
    Map<String, List<String>> map = new HashMap<>();
    for (String s: strings) {
      String key = "";

      for (int i = 1; i < s.length(); i++) {
        int diff = (s.charAt(i) - s.charAt(i - 1) + 26) % 26;
        if (diff < 10) {
          key += "0" + diff;
        } else {
          key += diff;
        }
      }

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(s);
    }

    return new ArrayList<>(map.values());
  }
}
