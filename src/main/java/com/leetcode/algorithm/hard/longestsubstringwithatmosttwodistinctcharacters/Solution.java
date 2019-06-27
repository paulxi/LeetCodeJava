package com.leetcode.algorithm.hard.longestsubstringwithatmosttwodistinctcharacters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int lengthOfLongestSubstringTwoDistinct(String s) {
    int ans = 0;
    int left = 0;
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      map.put(c, i);
      if (map.size() == 3) {
        int idx = Collections.min(map.values());
        map.remove(s.charAt(idx));
        left = idx + 1;
      }

      ans = Math.max(ans, i - left + 1);
    }
    return ans;
  }
}
