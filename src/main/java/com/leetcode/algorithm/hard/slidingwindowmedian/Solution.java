package com.leetcode.algorithm.hard.slidingwindowmedian;

import java.util.PriorityQueue;

//if (maxQueue.size() == minQueue.size()) {
//    return (maxQueue.peek() + minQueue.peek()) / 2.0;
//    } else {
//    return maxQueue.peek();
//    }

class Solution {
  public double[] medianSlidingWindow(int[] nums, int k) {
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>((Integer a, Integer b) -> b.compareTo(a));
    PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    double[] result = new double[nums.length + 1 - k];

    for (int i = 0; i <= nums.length; i++) {
      if (i >= k) {
        if (maxQueue.size() == minQueue.size()) {
          result[i - k] = ((double)maxQueue.peek() + (double)minQueue.peek()) / 2.0;
        } else {
          result[i - k] =  maxQueue.peek();
        }

        int numToRemove = nums[i - k];
        if (numToRemove <= result[i - k]) {
          maxQueue.remove(numToRemove);
        } else {
          minQueue.remove(numToRemove);
        }

        if (maxQueue.size() - minQueue.size() == 2) {
          minQueue.add(maxQueue.poll());
        } else if (maxQueue.size() - minQueue.size() == -1) {
          maxQueue.add(minQueue.poll());
        }
      }

      if (i < nums.length) {
        int num = nums[i];

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
    }
    return result;
  }
}
