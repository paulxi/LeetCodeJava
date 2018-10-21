package com.leetcode.algorithm.medium.mergeintervals;

import com.leetcode.algorithm.common.Interval;

import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<Interval> merge(List<Interval> intervals) {
    intervals.sort(
        (Interval o1, Interval o2) -> {
          if (o1.start < o2.start) {
            return -1;
          } else if (o1.start > o2.start) {
            return 1;
          } else {
            return o1.end - o2.end;
          }
        }
    );

    LinkedList<Interval> result = new LinkedList<>();
    for (Interval interval : intervals) {
      if (result.isEmpty()) {
        result.add(interval);
      } else {
        Interval last = result.getLast();
        if (last.end >= interval.start) {
          last.end = Math.max(interval.end, last.end);
        } else {
          result.add(interval);
        }
      }
    }
    return result;
  }
}
