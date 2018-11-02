package com.leetcode.algorithm.hard.minimumwindowsubstring;

import java.util.*;

class Solution {
  public String minWindow(String s, String t) {
    if (s.length() < t.length() || t.length() == 0) {
      return "";
    }

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      int count = map.getOrDefault(t.charAt(i), 0);
      map.put(t.charAt(i), count + 1);
    }

    int required = map.size();

    int l = 0, r = 0;

    int formed = 0;

    Map<Character, Integer> windowCounts = new HashMap<>();

    int[] ans = {-1, 0, 0};

    while(r < s.length()) {
      char c = s.charAt(r);
      int count = windowCounts.getOrDefault(c, 0);
      windowCounts.put(c, count + 1);

      if (map.containsKey(c) && windowCounts.get(c).intValue() == map.get(c).intValue()) {
        formed++;
      }

      while (l <= r && formed == required) {
        c = s.charAt(l);
        if (ans[0] == -1 || r - l + 1 < ans[0]) {
          ans[0] = r - l + 1;
          ans[1] = l;
          ans[2] = r;
        }

        windowCounts.put(c, windowCounts.get(c) - 1);
        if (map.containsKey(c) && windowCounts.get(c).intValue() < map.get(c).intValue()) {
          formed--;
        }

        l++;
      }

      r++;
    }

    return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
  }
}
