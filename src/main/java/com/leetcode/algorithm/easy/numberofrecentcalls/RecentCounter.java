package com.leetcode.algorithm.easy.numberofrecentcalls;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
//  int[] count;
//  int[] timestamp;
//  public RecentCounter() {
//    timestamp = new int[3001];
//    count = new int[3001];
//  }
//
//  public int ping(int t) {
//    int num = t % 3001;
//    if (timestamp[num] == t) {
//      count[num]++;
//    } else {
//      count[num] = 1;
//      timestamp[num] = t;
//    }
//
//    int res = 0;
//    for (int i = 0; i < count.length; i++) {
//      if (timestamp[i] + 3000 >= t) {
//        res += count[i];
//      }
//    }
//
//    return res;
//  }

  Queue<Integer> queue;
  public RecentCounter() {
    queue = new LinkedList();
  }

  public int ping(int t) {
    queue.add(t);
    while (queue.peek() < t - 3000)
      queue.poll();
    return queue.size();
  }
}
