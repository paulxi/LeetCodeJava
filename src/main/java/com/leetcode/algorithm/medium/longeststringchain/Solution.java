package com.leetcode.algorithm.medium.longeststringchain;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int longestStrChain(String[] words) {
    Arrays.sort(words, (a, b) -> a.length() - b.length());
    Map<String, Integer> dp = new HashMap<>();
    for (String word: words) {
      int max = 0;
      for (int i = 0; i < word.length(); i++) {
        String prev = word.substring(0, i) + word.substring(i + 1);
        max = Math.max(max, dp.getOrDefault(prev, 0) + 1);
      }
      dp.put(word, max);
    }

    return Collections.max(dp.values());
  }
}
