package com.leetcode.algorithm.hard.longestvalidparentheses;

import java.util.Stack;

class Solution {
//  public int longestValidParentheses(String s) {
//    if (s.length() == 0) {
//      return 0;
//    }
//    Stack<Integer> stack = new Stack<>();
//    stack.push(-1);
//    int maxLen = 0;
//    for (int i = 0; i < s.length(); i++) {
//      if (s.charAt(i) == '(') {
//        stack.push(i);
//      } else {
//        stack.pop();
//        if (stack.isEmpty()) {
//          stack.push(i);
//        } else {
//          maxLen = Math.max(maxLen, i - stack.peek());
//        }
//      }
//    }
//
//    return maxLen;
//  }

  public int longestValidParentheses(String s) {
    int maxLen = 0;
    int left = 0;
    int right = 0;

    // scan from left to right
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        left++;
      } else {
        right++;
        if (left == right) {
          maxLen = Math.max(maxLen, left + right);
        } else if (right > left) {
          left = 0;
          right = 0;
        }
      }
    }

    left = 0;
    right = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      if (c == ')') {
        right++;
      } else {
        left++;
        if (right == left) {
          maxLen = Math.max(maxLen, left + right);
        } else if (left > right) {
          left = 0;
          right = 0;
        }
      }
    }

    return maxLen;
  }
}
