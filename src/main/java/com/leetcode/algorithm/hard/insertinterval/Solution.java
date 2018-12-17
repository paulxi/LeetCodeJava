package com.leetcode.algorithm.hard.insertinterval;

import com.leetcode.algorithm.common.Interval;

import java.util.*;

class Solution {
  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new ArrayList<>();
    Interval theInterval = new Interval(newInterval.start, newInterval.end);

    for (Interval interval: intervals) {
      if (theInterval == null || interval.end < theInterval.start) {
        result.add(interval);
      } else if (interval.start > theInterval.end) {
        result.add(theInterval);
        result.add(interval);
        theInterval = null;
      } else {
        theInterval.start = Math.min(theInterval.start, interval.start);
        theInterval.end = Math.max(theInterval.end, interval.end);
      }
    }

    if (theInterval != null) {
      result.add(theInterval);
    }

    return result;
  }
}
