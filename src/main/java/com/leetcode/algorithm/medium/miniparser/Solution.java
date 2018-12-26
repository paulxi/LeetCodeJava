package com.leetcode.algorithm.medium.miniparser;

import com.leetcode.algorithm.common.NestedInteger;
import com.leetcode.algorithm.common.NestedIntegerInteger;
import com.leetcode.algorithm.common.NestedIntegerList;

import java.util.Stack;

class Solution {
  public NestedInteger deserialize(String s) {
    Stack<NestedInteger> stack = new Stack<>();
    int i = 0;
    int num = 0;
    int sign = 1;
    while (i < s.length()) {
      char c = s.charAt(i);
      if (c == '-') {
        sign = -1;
      } else if (Character.isDigit(c)) {
        num = c - '0';
        while (i + 1 != s.length() && s.charAt(i + 1) != ',' && Character.isDigit(s.charAt(i + 1))) {
          i++;
          c = s.charAt(i);
          num = num * 10 + c - '0';
        }
        NestedInteger integer = new NestedIntegerInteger(sign * num);
        sign = 1;
        if (stack.isEmpty()) {
          return integer;
        } else {
          stack.peek().add(integer);
        }
      } else if (c == '[') {
        NestedInteger current = new NestedIntegerList();
        if (!stack.isEmpty()) {
          stack.peek().add(current);
        }
        stack.push(current);
      } else if (c == ']') {
        NestedInteger popped = stack.pop();
        if (stack.isEmpty()) {
          return popped;
        }
      }
      i++;
    }

    return null;
  }
}
