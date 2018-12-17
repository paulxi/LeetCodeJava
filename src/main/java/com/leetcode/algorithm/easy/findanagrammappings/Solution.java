package com.leetcode.algorithm.easy.findanagrammappings;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] anagramMappings(int[] a, int[] b) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < b.length; i++) {
      map.put(b[i], i);
    }

    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      int index = map.get(a[i]);
      result[i] = index;
    }

    return result;
  }
}
