package com.leetcode.algorithm.medium.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      List<String> list;
      if (map.containsKey(key)) {
        list = map.get(key);
      } else {
        list = new ArrayList<>();
        map.put(key, list);
      }
      list.add(str);
    }

    return new ArrayList<>(map.values());
  }
}
