package com.leetcode.algorithm.medium.minimumremovetomakevalidparentheses;

import java.util.Stack;

class Solution {
  public String minRemoveToMakeValid(String s) {
    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        stack.push(i);
      }
      if (c == ')') {
        if (!stack.isEmpty()) {
          stack.pop();
        } else {
          sb.setCharAt(i, '*');
        }
      }
    }
    while (!stack.isEmpty()) {
      sb.setCharAt(stack.pop(), '*');
    }
    return sb.toString().replaceAll("\\*", "");
  }
}
