package com.leetcode.algorithm.medium.basiccalculatorii;

import java.util.Stack;

class Solution {
  public int calculate(String s) {
    if (s.length() == 0) {
      return 0;
    }

    Stack<Integer> stack = new Stack<>();
    int num = 0;
    char sign = '+';
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        continue;
      }

      if (Character.isDigit(s.charAt(i))) {
        num = num * 10 + s.charAt(i) - '0';
      } else {
        if (sign == '-') {
          stack.push(-num);
        }
        if (sign == '+') {
          stack.push(num);
        }
        if (sign == '*') {
          stack.push(stack.pop() * num);
        }
        if (sign == '/') {
          stack.push(stack.pop() / num);
        }
        sign = s.charAt(i);
        num = 0;
      }
    }

    if (num != 0) {
      if (sign == '-') {
        stack.push(-num);
      }
      if (sign == '+') {
        stack.push(num);
      }
      if (sign == '*') {
        stack.push(stack.pop() * num);
      }
      if (sign == '/') {
        stack.push(stack.pop() / num);
      }
    }

    int ans = 0;
    while (!stack.isEmpty()) {
      ans += stack.pop();
    }

    return ans;
  }
}
