package com.leetcode.algorithm.easy.longestcommonprefix;

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    if (strs.length == 1) {
      return strs[0];
    }

    StringBuilder ans = new StringBuilder();
    int index = 0;
    boolean end = false;

    while (!end) {
      char c = (char) 0;
      for (int i = 0; i < strs.length; i++) {
        if (index == strs[i].length()) {
          end = true;
          break;
        }

        if (i == 0) {
          c = strs[i].charAt(index);
        } else {
          if (strs[i].charAt(index) != c) {
            end = true;
            break;
          }

          if (i == strs.length - 1) {
            ans.append(c);
          }
        }
      }

      index += 1;
    }

    return ans.toString();
  }
}
