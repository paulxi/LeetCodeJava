package com.leetcode.algorithm.medium.evaluatereversepolishnotation;

import java.util.Stack;

class Solution {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String token: tokens) {
      if (token.equals("+")) {
        int value1 = stack.pop();
        int value2 = stack.pop();
        stack.push(value1 + value2);
      } else if (token.equals("-")) {
        int value1 = stack.pop();
        int value2 = stack.pop();
        stack.push(value2 - value1);
      } else if (token.equals("*")) {
        int value1 = stack.pop();
        int value2 = stack.pop();
        stack.push(value1 * value2);
      } else if (token.equals("/")) {
        int value1 = stack.pop();
        int value2 = stack.pop();
        stack.push(value2 / value1);
      } else {
        stack.push(Integer.valueOf(token));
      }
    }

    return stack.peek();
  }
}
