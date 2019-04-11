package com.leetcode.algorithm.medium.flipgameii;

import java.util.HashMap;
import java.util.Map;

class Solution {
  private Map<String, Boolean> memo = new HashMap<>();

  public boolean canWin(String s) {
    if (s.length() < 2) {
      return false;
    }

    if (memo.containsKey(s)) {
      return memo.get(s);
    }

    for (int i = 0; i < s.length() - 1; i++) {
      if (s.startsWith("++", i)) {
        String t = s.substring(0, i) + "--" + s.substring(i + 2);

        if (!canWin(t)) {
          memo.put(s, true);
          return true;
        }
      }
    }

    memo.put(s, false);
    return false;
  }
}
