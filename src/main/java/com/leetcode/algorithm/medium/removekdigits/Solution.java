package com.leetcode.algorithm.medium.removekdigits;

import java.util.Stack;

class Solution {
  public String removeKdigits(String num, int k) {
    Stack<Character> stack = new Stack<>();
    int count = k;
    for (char c: num.toCharArray()) {
      while (!stack.isEmpty() && c < stack.peek() && count > 0) {
        stack.pop();
        count--;
      }

      stack.push(c);
    }

    while (count > 0) {
      stack.pop();
      count--;
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    sb.reverse();

    while (sb.length() > 0 && sb.charAt(0) == '0') {
      sb.deleteCharAt(0);
    }

    if (sb.length() == 0) {
      return "0";
    } else {
      return sb.toString();
    }
  }
}
