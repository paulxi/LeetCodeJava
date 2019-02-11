package com.leetcode.algorithm.easy.kthlargestelementinastream;

import java.util.PriorityQueue;

class KthLargest {
  final PriorityQueue<Integer> pq;
  final int k;

  public KthLargest(int k, int[] nums) {
    pq = new PriorityQueue<>();
    this.k = k;

    for (int num: nums) {
      add(num);
    }
  }

  public int add(int val) {
    if (pq.size() < k) {
      pq.offer(val);
    } else if (pq.peek() < val) {
      pq.poll();
      pq.offer(val);
    }

    return pq.peek();
  }
}
