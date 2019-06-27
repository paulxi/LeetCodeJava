package com.leetcode.algorithm.medium.findandreplaceinstring;

import java.util.*;

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

  public String findReplaceString2(String s, int[] indexes, String[] sources, String[] targets) {
    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < indexes.length; i++) {
      list.add(new int[] {indexes[i], i});
    }
    Collections.sort(list, (a, b) -> a[0] - b[0]);

    for (int i = list.size() - 1; i >= 0; i--) {
      int[] item = list.get(i);
      int index = item[0];
      String src = sources[item[1]];
      if (s.substring(index, index + src.length()).equals(src)) {
        s = s.substring(0, index) + targets[item[1]] + s.substring(index + src.length());
      }
    }

    return s;
  }
}
