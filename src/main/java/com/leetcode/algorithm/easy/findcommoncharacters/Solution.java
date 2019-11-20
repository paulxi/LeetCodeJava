package com.leetcode.algorithm.easy.findcommoncharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<String> commonChars(String[] strs) {
    List<String> ans = new ArrayList<>();
    int[] count = new int[26];
    Arrays.fill(count, Integer.MAX_VALUE);
    for (String s: strs) {
      int[] cnt = new int[26];
      for (char c: s.toCharArray()) {
        cnt[c - 'a']++;
      }
      for (int i = 0; i < 26; i++) {
        count[i] = Math.min(cnt[i], count[i]);
      }
    }
    for (char c = 'a'; c <= 'z'; c++) {
      while (count[c - 'a'] > 0) {
        ans.add("" + c);
        count[c - 'a']--;
      }
    }
    return ans;
  }
}
