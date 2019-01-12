package com.leetcode.algorithm.hard.expressionaddoperators;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> addOperators(String num, int target) {
    List<String> result = new ArrayList<>();
    helper(num, target, 0, 0, 0, "", result);
    return result;
  }

  private void helper(String num, int target, int pos, long prev, long curr, String path, List<String> result) {
    if (pos == num.length()) {
      if (target == curr) {
        result.add(path);
      }
      return;
    }

    for (int len = 1; len + pos <= num.length(); len++) {
      String sub = num.substring(pos, len + pos);
      if (sub.startsWith("0") && len > 1) {
        break;
      }

      long n = Long.parseLong(sub);

      if (pos == 0) {
        helper(num, target, len, n, n, path + sub, result);
      } else {
        helper(num, target, pos + len, n, curr + n, path + "+" + sub, result);
        helper(num, target, pos + len, -n, curr - n, path + "-" + sub, result);
        helper(num, target, pos + len, n * prev, curr - prev + n * prev, path + "*" + sub, result);
      }
    }
  }
}
