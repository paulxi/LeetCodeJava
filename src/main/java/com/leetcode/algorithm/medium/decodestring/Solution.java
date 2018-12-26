package com.leetcode.algorithm.medium.decodestring;

import java.util.Stack;

class Solution {
  public String decodeString(String s) {
    Stack<String> stack = new Stack<>();
    for (char c: s.toCharArray()) {
      if (c >= '0' && c <= '9') {
        if (!stack.isEmpty()) {
          String peek = stack.peek();
          if (peek.charAt(0) >= '0' && peek.charAt(0) <= '9') {
            stack.push(stack.pop() + c);
          } else {
            stack.push("" + c);
          }
        } else {
          stack.push("" + c);
        }
      } else if (c == '[') {
        stack.push("[");
      } else if (c == ']') {
        String str = stack.pop();
        stack.pop();
        int repeat = Integer.valueOf(stack.pop());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
          stringBuilder.append(str);
        }

        if (!stack.isEmpty() && !stack.peek().equals("[")) {
          stringBuilder.insert(0, stack.pop());
        }
        stack.push(stringBuilder.toString());
      } else {
        if (!stack.isEmpty()) {
          if (stack.peek().equals("[")) {
            stack.push("" + c);
          } else {
            stack.push(stack.pop() + c);
          }
        } else {
          stack.push("" + c);
        }
      }
    }

    if (stack.isEmpty()) {
      return "";
    }

    return stack.pop();
  }
}
