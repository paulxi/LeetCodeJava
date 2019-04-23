package com.leetcode.algorithm.medium.generalizedabbreviation;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> generateAbbreviations(String word) {
    List<String> res = new ArrayList<>();

    helper(res, word, 0, "", 0);
    return res;
  }

  private void helper(List<String> res, String word, int pos, String cur, int count) {
    if (pos == word.length()) {
      if (count > 0) {
        cur += count;
      }
      res.add(cur);
      return;
    }

    helper(res, word, pos + 1, cur, count + 1);
    helper(res, word, pos + 1, cur + (count > 0 ? count : "") + word.charAt(pos), 0);
  }
}
