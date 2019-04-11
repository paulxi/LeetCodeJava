package com.leetcode.algorithm.hard.nooverlappinginterval;

import com.leetcode.algorithm.common.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
  public List<Interval> findIntervals(List<Interval> intervals, Interval requestInterval) {
    List<Interval> result = new ArrayList<>();
    if (intervals.isEmpty() || requestInterval.end < requestInterval.start) {
      return result;
    }

    PriorityQueue<Interval> pq = new PriorityQueue<>((o1, o2) -> o1.start - o2.start);
    for (Interval interval: intervals) {
      pq.offer(interval);
    }

    while (!pq.isEmpty() && pq.peek().end <= requestInterval.start) {
      pq.poll();
    }

    if (pq.isEmpty()) {
      return result;
    }

    int start = requestInterval.start;
    if (start < pq.peek().start) {
      if (requestInterval.end <= pq.peek().start) {
        result.add(requestInterval);
        return result;
      } else {
        result.add(new Interval(start, pq.peek().start));
      }
    }

    start = Math.max(start, pq.poll().end);
    while (!pq.isEmpty() && pq.peek().start < requestInterval.end) {
      Interval curr = pq.poll();
      result.add(new Interval(start, curr.start));
      start = curr.end;
    }

    if (start < requestInterval.end) {
      result.add(new Interval(start, requestInterval.end));
    }

    return result;
  }
}
