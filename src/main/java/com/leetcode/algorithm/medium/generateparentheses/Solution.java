package com.leetcode.algorithm.medium.generateparentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
//  public List<String> generateParenthesis(int n) {
//    if (n == 0) {
//      return Arrays.asList();
//    }
//    if (n == 1) {
//      return Arrays.asList("()");
//    }
//
//    List<String> previous = generateParenthesis(n - 1);
//    HashSet<String> result = new HashSet<>();
//    for (String item: previous) {
//      for (int i = 0; i < item.length(); i++) {
//        String parenthesis = item.substring(0, i) + "()" + item.substring(i);
//        if (!result.contains(parenthesis)) {
//          result.add(parenthesis);
//        }
//      }
//    }
//
//    return new ArrayList<>(result);
//  }

  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();

    backtrace("", 0, 0, n, result);
    return result;
  }

  private void backtrace(String cur, int left, int right, int n, List<String> result) {
    if (cur.length() == 2 * n) {
      result.add(cur);
      return;
    }

    if (left < n) {
      backtrace(cur + "(", left + 1, right, n, result);
    }

    if (right < left) {
      backtrace(cur + ")", left, right + 1, n, result);
    }
  }
}
