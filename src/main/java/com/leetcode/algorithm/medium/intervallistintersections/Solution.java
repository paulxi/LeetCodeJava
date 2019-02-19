package com.leetcode.algorithm.medium.intervallistintersections;

import com.leetcode.algorithm.common.Interval;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public Interval[] intervalIntersection(Interval[] a, Interval[] b) {
    List<Interval> ans = new ArrayList<>();
    int i = 0;
    int j = 0;

    while (i < a.length && j < b.length) {
      int lo = Math.max(a[i].start, b[j].start);
      int hi = Math.min(a[i].end, b[j].end);

      if (lo <= hi) {
        ans.add(new Interval(lo, hi));
      }

      if (a[i].end < b[j].end) {
        i++;
      } else {
        j++;
      }
    }

    return ans.toArray(new Interval[ans.size()]);
  }
}
