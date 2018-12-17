package com.leetcode.algorithm.medium.longestabsolutefilepath;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int lengthLongestPath(String input) {
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(0);
    int maxLen = 0;
    for (String str : input.split("\n")) {
      int lev = str.lastIndexOf("\t") + 1;
      while (lev + 1 < stack.size()) {
        stack.pop();
      }
      //add "/" at the end
      int len = stack.peek() + str.length() - lev + 1;
      stack.push(len);
      if (str.contains(".")) {
        //remove "/" from the end
        maxLen = Math.max(maxLen, len - 1);
      }
    }

    return maxLen;
  }
}
