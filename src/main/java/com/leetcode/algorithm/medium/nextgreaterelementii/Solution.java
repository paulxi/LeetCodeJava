package com.leetcode.algorithm.medium.nextgreaterelementii;

import java.util.Stack;

class Solution {
  public int[] nextGreaterElements(int[] nums) {
    int[] ans = new int[nums.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = 2 * nums.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
        stack.pop();
      }

      ans[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
      stack.push(i % nums.length);
    }

    return ans;
  }
}
