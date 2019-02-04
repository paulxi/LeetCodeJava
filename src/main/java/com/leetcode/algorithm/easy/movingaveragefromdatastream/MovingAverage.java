package com.leetcode.algorithm.easy.movingaveragefromdatastream;

import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {

  int sum;
  Queue<Integer> queue;
  int size;

  /** Initialize your data structure here. */
  public MovingAverage(int size) {
    this.size = size;
    sum  = 0;
    queue = new LinkedList<>();
  }

  public double next(int val) {
    if (queue.size() < size) {
      sum += val;
    } else {
      sum += val - queue.poll();
    }

    queue.offer(val);

    return (double)sum / queue.size();
  }
}
