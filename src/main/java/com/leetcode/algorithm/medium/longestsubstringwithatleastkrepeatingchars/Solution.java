package com.leetcode.algorithm.medium.longestsubstringwithatleastkrepeatingchars;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int longestSubstring(String s, int k) {
    char[] str = s.toCharArray();
    return helper(str, 0, str.length, k, new HashMap<>());
  }

  private int helper(char[] str, int start, int end,  int k, Map<String, Integer> memo) {
    if (memo.containsKey(String.valueOf(str, start, end - start))) {
      return memo.get(String.valueOf(str, start, end - start));
    }
    if ((end - start) < k) {
      return 0;
    }
    int[] count = new int[26];
    for (int i = start; i < end; i++) {
      char c = str[i];
      count[c - 'a']++;
    }

    for (int i = 0; i < count.length; i++) {
      if (count[i] < k && count[i] > 0) {
        for (int j = start; j < end; j++) {
          if (str[j] == 'a' + i) {
            int left = helper(str, start, j, k, memo);
            int right = helper(str, j + 1, end, k, memo);
            return Math.max(left, right);
          }
        }
      }
    }

    memo.put(String.valueOf(str, start, end - start), end - start);

    return end - start;
  }
}
