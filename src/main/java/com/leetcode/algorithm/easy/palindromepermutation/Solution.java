package com.leetcode.algorithm.easy.palindromepermutation;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean canPermutePalindrome(String s) {
    boolean isOdd = s.length() % 2 == 1;

    Map<Character, Integer> map = new HashMap<>();
    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int oddCount = 0;
    for (char c: map.keySet()) {
      if (map.get(c) % 2 == 1) {
        oddCount += 1;
      }

      if (!isOdd && oddCount != 0) {
        return false;
      }
      if (isOdd && oddCount > 1) {
        return false;
      }
    }

    return true;
  }
}
