package com.leetcode.algorithm.hard.substrwithconcatofallwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    if (s.length() == 0 || words.length == 0) {
      return new ArrayList<>();
    }

    Map<String, Integer> map = new HashMap<>();
    for (String word: words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    List<Integer> ans = new ArrayList<>();
    int n = s.length();
    int num = words.length;
    int len = words[0].length();
    for (int i = 0; i < n - num * len + 1; i++) {
      int j = 0;
      Map<String, Integer> count = new HashMap<>();
      while (j < num) {
        String word = s.substring(i + j * len, i + (j + 1) * len);
        if (map.containsKey(word)) {
          count.put(word, count.getOrDefault(word, 0) + 1);
          if (map.get(word) < count.get(word)) {
            break;
          }
        } else {
          break;
        }
        j++;
      }

      if (j == num) {
        ans.add(i);
      }
    }

    return ans;
  }
}
