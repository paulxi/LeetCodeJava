package com.leetcode.algorithm.hard.longestsubstringwithatmosttwodistinctcharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int lengthOfLongestSubstringTwoDistinct(String s) {
    int ans = 0;
    int ptr = 0;
    Map<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (count.containsKey(c)) {
        count.put(c, count.get(c) + 1);
      } else {
        count.put(c, 1);
      }

      while (count.size() > 2) {
        char ptrChar = s.charAt(ptr);
        count.put(ptrChar, count.get(ptrChar) - 1);
        if (count.get(ptrChar) == 0) {
          count.remove(ptrChar);
        }
        ptr += 1;
      }

      ans = Math.max(ans, i - ptr + 1);
    }

    return ans;
  }
}
