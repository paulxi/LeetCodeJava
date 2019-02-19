package com.leetcode.algorithm.easy.meetingrooms;

import com.leetcode.algorithm.common.Interval;

import java.util.Arrays;

class Solution {
  public boolean canAttendMeetings(Interval[] intervals) {
    Arrays.sort(intervals, (a, b) -> a.start - b.start);

    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i].start < intervals[i - 1].end) {
        return false;
      }
    }
    return true;
  }
}
