package com.leetcode.algorithm.hard.shortestsubarraywithsumatleastk;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int shortestSubarray(int[] nums, int k) {
    int n = nums.length;
    int res = n + 1;
    int[] sum = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      sum[i] = sum[i - 1] + nums[i - 1];
    }

    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < sum.length; i++) {
      while (!deque.isEmpty() && sum[i] - sum[deque.getFirst()] >= k) {
        res = Math.min(res, i - deque.pollFirst());
      }

      while (!deque.isEmpty() && sum[i] <= sum[deque.getLast()]) {
        deque.pollLast();
      }

      deque.offer(i);
    }

    return res <= n ? res : -1;
  }
}
