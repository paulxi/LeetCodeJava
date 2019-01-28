package com.leetcode.algorithm.hard.longestsubstringwithatmostkdistinctcharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    int ans = 0;
    int ptr = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);

      while (map.size() > k) {
        char p = s.charAt(ptr);
        map.put(p, map.get(p) - 1);
        if (map.get(p) == 0) {
          map.remove(p);
        }
        ptr++;
      }

      ans = Math.max(ans, i - ptr + 1);
    }

    return ans;
  }
}
