package com.leetcode.algorithm.hard.scramblestring;

import java.util.HashMap;
import java.util.Map;

class Solution {
  Map<String, Boolean> memo = new HashMap<>();

  public boolean isScramble(String s1, String s2) {
    if (s1.equals(s2)) {
      return true;
    }

    String key = s1 + "|" + s2;
    if (memo.containsKey(key)) {
      return memo.get(key);
    }

    int[] letters = new int[26];
    for (int i = 0; i < s1.length(); i++) {
      letters[s1.charAt(i) - 'a']++;
      letters[s2.charAt(i) - 'a']--;
    }

    for (int i = 0; i < 26; i++) {
      if (letters[i] != 0) {
        return false;
      }
    }

    for (int i = 1; i < s2.length(); i++) {
      if (isScramble(s1.substring(0, i), s2.substring(0, i))
          && isScramble(s1.substring(i), s2.substring(i))) {
        memo.put(key, true);
        return true;
      }

      if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i))
          && isScramble(s1.substring(i), s2.substring(0, s2.length() - i))) {
        memo.put(key, true);
        return true;
      }
    }

    memo.put(key, false);

    return false;
  }
}
