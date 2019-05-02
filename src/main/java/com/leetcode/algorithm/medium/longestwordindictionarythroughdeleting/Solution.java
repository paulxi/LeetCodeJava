package com.leetcode.algorithm.medium.longestwordindictionarythroughdeleting;

import java.util.List;

class Solution {
  public String findLongestWord(String s, List<String> d) {
    String ans = "";
    int max = 0;

    for (String str: d) {
      if (str.length() > s.length()) {
        continue;
      }
      int i = 0;
      int j = 0;
      while (i < s.length() && j < str.length()) {
        if (s.charAt(i) == str.charAt(j)) {
          i++;
          j++;
        } else {
          i++;
        }
      }

      if (j == str.length()) {
        if (j > max) {
          max = j;
          ans = str;
        } else if (j == max && str.compareTo(ans) < 0) {
          ans = str;
        }
      }
    }

    return ans;
  }
}
