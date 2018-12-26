package com.leetcode.algorithm.easy.subdomainvisitcount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<String> subdomainVisits(String[] cpdomains) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String cpdomain: cpdomains) {
      String[] strs = cpdomain.split(" ");
      int count = Integer.valueOf(strs[0]);
      String domain = strs[1];

      String[] segments = domain.split("\\.");
      int i = segments.length - 1;
      StringBuilder sb = new StringBuilder();
      while (i >= 0) {
        if (i != segments.length - 1) {
          sb.insert(0, '.');
        }
        sb.insert(0, segments[i]);
        String subdoamin = sb.toString();
        map.put(subdoamin, map.getOrDefault(subdoamin, 0) + count);
        i--;
      }
    }

    List<String> result = new ArrayList<>();
    for (String key: map.keySet()) {
      result.add(map.get(key) + " " + key);
    }

    return result;
  }
}
