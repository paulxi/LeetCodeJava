package com.leetcode.algorithm.hard.wordbreakii;

import java.util.*;

class Solution {
  public List<String> wordBreak(String s, List<String> wordDict) {
    Set<String> wordSet = new HashSet<>(wordDict);

    // Check if there is at least one possible sentence
    boolean[] dp1 = new boolean[s.length() + 1];
    dp1[0] = true;
    for (int i = 1; i <= s.length(); i++) {
      for (int j = 0; j < i; j++) {
        if (dp1[j] && wordSet.contains(s.substring(j, i))) {
          dp1[i] = true;
          break;
        }
      }
    }

    // We are done if there isn't a valid sentence at all
    if (!dp1[s.length()]) {
      return new ArrayList<String>();
    }

    // Build the results with dynamic programming
    LinkedList<String>[] dp = new LinkedList[s.length() + 1];
    LinkedList<String> initial = new LinkedList<>();
    initial.add("");
    dp[0] = initial;
    for (int i = 1; i <= s.length(); i++) {
      LinkedList<String> list = new LinkedList<>();
      for (int j = 0; j < i; j++) {
        if (dp[j].size() > 0 && wordSet.contains(s.substring(j, i))) {
          for (String l : dp[j]) {
            list.add(l + (l.equals("") ? "" : " ") + s.substring(j, i));
          }
        }
      }
      dp[i] = list;
    }
    return dp[s.length()];
  }
}
