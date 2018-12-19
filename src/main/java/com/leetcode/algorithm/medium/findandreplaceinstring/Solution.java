package com.leetcode.algorithm.medium.findandreplaceinstring;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {
    HashMap<Integer, String[]> map = new HashMap<>();
    for (int i = 0; i < indexes.length; i++) {
      map.put(indexes[i], new String[]{sources[i], targets[i]});
    }

    Arrays.sort(indexes);

    int diff = 0;
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < indexes.length; i++) {
      String[] pair = map.get(indexes[i]);
      String src = pair[0];
      String dest = pair[1];
      int index = indexes[i] + diff;

      if (sb.subSequence(index, src.length() + index).equals(src)) {
        sb.replace(index, src.length() + index, dest);
        diff += dest.length() - src.length();
      }
    }

    return sb.toString();
  }
}
