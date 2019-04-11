package com.leetcode.algorithm.hard.concatenatedwords;

import java.util.*;

class Solution {
  public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> result = new ArrayList<>();
    Set<String> dict = new HashSet<>(Arrays.asList(words));
    dict.remove("");

    for (String word: words) {
      if (word.length() > 0 && canForm(word, dict)) {
        result.add(word);
      }
    }

    return result;
  }

  private boolean canForm(String word, Set<String> dict) {
    boolean[] dp = new boolean[word.length() + 1];
    dp[0] = true;

    for (int i = 1; i < dp.length; i++) {
      for (int j = 0; j < i; j++) {
        if (dp[j] && !(j == 0 && i == word.length()) && dict.contains(word.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }

    return dp[dp.length - 1];
  }
}
