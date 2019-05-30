package com.leetcode.algorithm.medium.differentwaystoaddparentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  Map<String, List<Integer>> map = new HashMap<>();

  public List<Integer> diffWaysToCompute(String input) {
    if (map.containsKey(input)) {
      return map.get(input);
    }
    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '+' || c == '-' || c == '*') {
        List<Integer> left = diffWaysToCompute(input.substring(0, i));
        List<Integer> right = diffWaysToCompute(input.substring(i + 1));

        for (int l: left) {
          for (int r: right) {
            if (c == '+') {
              ans.add(l + r);
            } else if (c == '-') {
              ans.add(l - r);
            } else if (c == '*') {
              ans.add(l * r);
            }
          }
        }
      }
    }

    if (ans.size() == 0) {
      ans.add(Integer.valueOf(input));
    }

    map.put(input, ans);
    return ans;
  }
}
