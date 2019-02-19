package com.leetcode.algorithm.medium.simplifypath;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
  public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
    for (String dir: path.split("/")) {
      if (dir.equals("..") && !stack.isEmpty()) {
        stack.pop();
      } else {
        if (!skip.contains(dir)) {
          stack.push(dir);
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.insert(0, "/" + stack.pop());
    }

    String ans = sb.toString();
    if (ans.length() == 0) {
      return "/";
    } else {
      return ans;
    }
  }
}
