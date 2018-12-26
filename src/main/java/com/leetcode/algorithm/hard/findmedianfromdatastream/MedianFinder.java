package com.leetcode.algorithm.hard.findmedianfromdatastream;

import java.util.PriorityQueue;

class MedianFinder {
  PriorityQueue<Integer> maxQueue = new PriorityQueue<>((Integer a, Integer b) -> b.compareTo(a));
  PriorityQueue<Integer> minQueue = new PriorityQueue<>();

  /**
   * initialize your data structure here.
   */
  public MedianFinder() {

  }

  public void addNum(int num) {
    if (maxQueue.size() == 0 || num <= maxQueue.peek()) {
      maxQueue.add(num);
      if (maxQueue.size() - minQueue.size() == 2) {
        minQueue.add(maxQueue.poll());
      }
    } else {
      minQueue.add(num);
      if (minQueue.size() - maxQueue.size() == 1) {
        maxQueue.add(minQueue.poll());
      }
    }
  }

  public double findMedian() {
    if (maxQueue.size() == minQueue.size()) {
      return (maxQueue.peek() + minQueue.peek()) / 2.0;
    } else {
      return maxQueue.peek();
    }
  }
}
