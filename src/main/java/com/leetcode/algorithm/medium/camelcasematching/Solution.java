package com.leetcode.algorithm.medium.camelcasematching;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Boolean> camelMatch(String[] queries, String pattern) {
    List<Boolean> ans = new ArrayList<>();
    for (String query: queries) {
      ans.add(isMatch(query, pattern));
    }

    return ans;
  }

  private boolean isMatch(String query, String pattern) {
    int i = 0;
    for (char c: query.toCharArray()) {
      if (i < pattern.length() && c == pattern.charAt(i)) {
        i++;
      } else if (c >= 'A' && c <= 'Z') {
        return false;
      }
    }

    return i == pattern.length();
  }
}
