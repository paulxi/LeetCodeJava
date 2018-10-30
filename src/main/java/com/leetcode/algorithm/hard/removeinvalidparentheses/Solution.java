package com.leetcode.algorithm.hard.removeinvalidparentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> removeInvalidParentheses(String s) {
    List<String> ans = new ArrayList<>();
    remove(s, ans, 0, 0, new char[] {'(', ')'});

    return ans;
  }

  public void remove(String s, List<String> ans, int last_i, int last_j, char[] par) {
    for (int stack = 0, i = last_i; i < s.length(); i++) {
      if (s.charAt(i) == par[0]) {
        stack += 1;
      }
      if (s.charAt(i) == par[1]) {
        stack -= 1;
      }
      if (stack >= 0) {
        continue;
      }
      for (int j = last_j; j <= i; ++j) {
        if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1])) {
          remove(s.substring(0, j) + s.substring(j + 1), ans, i, j, par);
        }
      }

      return;
    }

    String reversed = new StringBuilder(s).reverse().toString();
    if (par[0] == '(') {
      remove(reversed, ans, 0, 0, new char[] {')', '('});
    } else {
      ans.add(reversed);
    }
  }
}