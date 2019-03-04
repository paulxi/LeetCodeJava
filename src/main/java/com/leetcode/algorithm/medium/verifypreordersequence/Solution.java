package com.leetcode.algorithm.medium.verifypreordersequence;

import java.util.Stack;

class Solution {
  public boolean verifyPreorder(int[] preorder) {
    Stack<Integer> stack = new Stack<>();
    int low = Integer.MIN_VALUE;
    for (int p: preorder) {
      if (p < low) {
        return false;
      }
      while (!stack.isEmpty() && p > stack.peek()) {
        low = stack.pop();
      }

      stack.push(p);
    }

    return true;
  }
}
