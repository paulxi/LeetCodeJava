package com.leetcode.algorithm.hard.slidingwindowmaximum;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (k == 0) {
      return new int[0];
    }
    int[] result = new int[nums.length - k + 1];
    Deque<Integer> deque = new ArrayDeque<>();
    for(int i = 0; i < nums.length; i++) {
      while (!deque.isEmpty() && deque.peek() <= i - k) {
        deque.poll();
      }

      while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
        deque.pollLast();
      }

      deque.offer(i);
      if (i + 1 >= k) {
        result[i + 1 - k] = nums[deque.peek()];
      }
    }

    return result;
  }
}
