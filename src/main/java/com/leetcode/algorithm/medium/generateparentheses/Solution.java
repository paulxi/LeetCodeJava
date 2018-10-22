package com.leetcode.algorithm.medium.generateparentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
  public List<String> generateParenthesis(int n) {
    if (n == 0) {
      return Arrays.asList();
    }
    if (n == 1) {
      return Arrays.asList("()");
    }

    List<String> previous = generateParenthesis(n - 1);
    HashSet<String> result = new HashSet<>();
    for (String item: previous) {
      for (int i = 0; i < item.length(); i++) {
        String parenthesis = item.substring(0, i) + "()" + item.substring(i);
        if (!result.contains(parenthesis)) {
          result.add(parenthesis);
        }
      }
    }

    return new ArrayList<>(result);
  }
}
