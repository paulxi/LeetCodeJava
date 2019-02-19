package com.leetcode.algorithm.easy.longestpalindrome;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int longestPalindrome(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int count = 0;
    boolean plusFlag = false;

    for (Map.Entry<Character, Integer> entry: map.entrySet()) {
      int value = entry.getValue();
      if (value % 2 == 0) {
        count += value;
      } else {
        count += value - 1;
        if (!plusFlag) {
          plusFlag = true;
        }
      }
    }

    return plusFlag ? count + 1 : count;
  }
}
