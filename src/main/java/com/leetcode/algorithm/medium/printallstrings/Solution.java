package com.leetcode.algorithm.medium.printallstrings;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> allStrings(String str) {
    List<String> result = new ArrayList<>();
    helper(result, str.toCharArray(), new StringBuilder(), 0);
    return result;
  }

  private void helper(List<String> result, char[] chars, StringBuilder sb, int index) {
    if (index == chars.length) {
      result.add(sb.toString());
      return;
    }

    StringBuilder items = null;

    while (index < chars.length) {
      char c = chars[index];

      if (c == '{') {
        items = new StringBuilder();
      } else if (c == '}') {
        String[] strs = items.toString().split(",");

        for (String str: strs) {
          int sbLen = sb.length();
          sb.append(str);
          helper(result, chars, sb, index + 1);
          sb.delete(sbLen, sb.length());
        }
        break;
      } else {
        if (items != null) {
          items.append(c);
        } else {
          sb.append(c);
        }
      }
      index++;
    }
  }
}
