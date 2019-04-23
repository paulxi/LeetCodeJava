package com.leetcode.algorithm.easy.minimumindexsumoftwolists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> map1 = new HashMap<>();
    for (int i = 0; i < list1.length; i++) {
      map1.put(list1[i], i);
    }
    Map<String, Integer> map2 = new HashMap<>();
    for (int i = 0; i < list2.length; i++) {
      map2.put(list2[i], i);
    }

    Set<String> set1 = map1.keySet();
    Set<String> set2 = map2.keySet();
    Set<String> set = new HashSet<>();
    for (String str: set1) {
      if (set2.contains(str)) {
        set.add(str);
      }
    }

    int min = Integer.MAX_VALUE;
    Set<String> res = new HashSet<>();
    for (String s: set) {
      int sum = map1.get(s) + map2.get(s);
      if (sum < min) {
        res.clear();
        res.add(s);
        min = sum;
      } else if (sum == min) {
        res.add(s);
      }
    }

    return res.toArray(new String[res.size()]);
  }
}
