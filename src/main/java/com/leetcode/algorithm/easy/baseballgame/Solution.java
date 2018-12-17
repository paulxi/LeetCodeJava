package com.leetcode.algorithm.easy.baseballgame;

import java.util.Stack;

class Solution {
  public int calPoints(String[] ops) {
    int sum = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < ops.length; i++) {
      if (ops[i].equals("C")) {
        sum -= stack.pop();
      } else if (ops[i].equals("D")) {
        int dbl = stack.peek() * 2;
        sum += dbl;
        stack.push(dbl);
      } else if (ops[i].equals("+")) {
        int val1 = stack.pop();
        int val2 = stack.pop();
        sum += val1 + val2;
        stack.push(val2);
        stack.push(val1);
        stack.push(val1 + val2);
      } else {
        sum += new Integer(ops[i]);
        stack.push(new Integer(ops[i]));
      }
    }

    return sum;
  }
}
