package com.leetcode.algorithm.hard.strobogrammaticnumberiii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int strobogrammaticInRange(String low, String high) {
    List<String> rst = new ArrayList<>();
    int count = 0;

    for (int n = low.length(); n <= high.length(); n++) {
      rst.addAll(helper(n, n));
    }

    for (String num: rst) {
      if ((num.length() == low.length() && num.compareTo(low) < 0) ||
          (num.length() == high.length() && num.compareTo(high) > 0)) {
        continue;
      }

      count++;
    }

    return count;
  }

  private List<String> helper(int n, int m) {
    if (n == 0) {
      return Arrays.asList("");
    }

    if (n == 1) {
      return Arrays.asList("0", "1", "8");
    }

    List<String> list = helper(n - 2, m);

    List<String> result = new ArrayList<>();
    for (String s: list) {
      if (n != m) {
        result.add("0" + s + "0");
      }

      result.add("1" + s + "1");
      result.add("8" + s + "8");
      result.add("6" + s + "9");
      result.add("9" + s + "6");
    }

    return result;
  }
}
