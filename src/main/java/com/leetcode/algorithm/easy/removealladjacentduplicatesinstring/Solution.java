package com.leetcode.algorithm.easy.removealladjacentduplicatesinstring;

import java.util.Stack;

class Solution {
//  public String removeDuplicates(String s) {
//    Stack<Character> stack = new Stack<>();
//    for (char c: s.toCharArray()) {
//      if (!stack.isEmpty() && stack.peek() == c) {
//        stack.pop();
//      } else {
//        stack.push(c);
//      }
//    }
//
//    StringBuilder sb = new StringBuilder();
//    while (!stack.isEmpty()) {
//      sb.append(stack.pop());
//    }
//
//    return sb.reverse().toString();
//  }

  public String removeDuplicates(String s) {
    int i = 0;
    int n = s.length();
    char[] stack = new char[n];

    for (int j = 0; j < n; j++) {
      if (i > 0 && stack[i - 1] == s.charAt(j)) {
        --i;
      } else {
        stack[i] = s.charAt(j);
        i++;
      }
    }

    return new String(stack, 0, i);
  }
}
