package com.leetcode.algorithm.easy.baseballgame;

import java.util.Stack;

class Solution {
  public int calPoints(String[] ops) {
    int sum = 0;
    Stack<Integer> stack = new Stack<>();
    for (String op : ops) {
      switch (op) {
        case "C":
          sum -= stack.pop();
          break;
        case "D":
          int dbl = stack.peek() * 2;
          sum += dbl;
          stack.push(dbl);
          break;
        case "+":
          int val1 = stack.pop();
          int val2 = stack.pop();
          sum += val1 + val2;
          stack.push(val2);
          stack.push(val1);
          stack.push(val1 + val2);
          break;
        default:
          sum += Integer.parseInt(op);
          stack.push(Integer.valueOf(op));
          break;
      }
    }

    return sum;
  }
}
