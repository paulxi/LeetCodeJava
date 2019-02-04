package com.leetcode.algorithm.hard.employeefreetime;

import com.leetcode.algorithm.common.Interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
  public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
    List<Interval> result = new ArrayList<>();
    if (schedule.size() == 0) {
      return result;
    }

    PriorityQueue<Interval> pq = new PriorityQueue<>(Comparator.comparingInt((a) -> a.start));
    schedule.forEach(e -> pq.addAll(e));

    Interval temp = pq.poll();
    while (!pq.isEmpty()) {
      if (temp.end < pq.peek().start) {
        result.add(new Interval(temp.end, pq.peek().start));
        temp = pq.poll();
      } else {
        if (temp.end < pq.peek().end) {
          temp = pq.peek();
        }
        pq.poll();
      }
    }
    return result;
  }
}
