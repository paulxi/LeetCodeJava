package com.leetcode.algorithm.easy.longestwordindictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public String longestWord(String[] words) {
    String ans = "";
    Set<String> set = new HashSet<>();
    Arrays.sort(words);

    for (String w: words) {
      if (w.length() == 1 || set.contains(w.substring(0, w.length() - 1))) {
        ans = w.length() > ans.length() ? w : ans;
        set.add(w);
      }
    }

    return ans;
  }
}
