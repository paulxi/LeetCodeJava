package com.leetcode.algorithm.medium.issubsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
//  public boolean isSubsequence(String s, String t) {
//    if (s.length() == 0) {
//      return true;
//    }
//
//    int indexS = 0;
//    int indexT = 0;
//
//    while (indexT < t.length()) {
//      if (s.charAt(indexS) == t.charAt(indexT)) {
//        indexS++;
//
//        if (indexS == s.length()) {
//          return true;
//        }
//      }
//
//      indexT++;
//    }
//
//    return false;
//  }

  public boolean isSubsequence(String s, String t) {
    Map<Character, List<Integer>> map = new HashMap<>();
    int index = 0;
    for (char c: t.toCharArray()) {
      if (!map.containsKey(c)) {
        map.put(c, new ArrayList<>());
      }

      map.get(c).add(index);
      index++;
    }

    int prev = -1;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (map.get(c) == null) {
        return false;
      } else {
        List<Integer> list = map.get(c);
        prev = binarySearch(prev, list, 0, list.size() - 1);
        if (prev == -1) {
          return false;
        }

        prev++;
      }
    }

    return true;
  }

  private int binarySearch(int index, List<Integer> list, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (list.get(mid) < index) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return start == list.size() ? -1 : list.get(start);
  }
}
