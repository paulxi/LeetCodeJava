package com.leetcode.algorithm.medium.meetingroomsii;

import com.leetcode.algorithm.common.Interval;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
  public int minMeetingRooms(Interval[] intervals) {
    if (intervals.length == 0) {
      return 0;
    }

    PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length, (a, b) -> {
      return a - b;
    });

    Arrays.sort(intervals, (a, b) -> {
      return a.start - b.start;
    });

    queue.add(intervals[0].end);
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i].start >= queue.peek()) {
        queue.poll();
      }

      queue.add(intervals[i].end);
    }

    return queue.size();
  }
}
