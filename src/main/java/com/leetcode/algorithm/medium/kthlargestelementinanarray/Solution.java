package com.leetcode.algorithm.medium.kthlargestelementinanarray;

import java.util.PriorityQueue;

class Solution {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    for (int num : nums) {
      if (heap.size() < k) {
        heap.offer(num);
      } else {
        if (num > heap.peek()) {
          heap.offer(num);
          heap.poll();
        }
      }
    }

    return heap.peek();
  }
}
