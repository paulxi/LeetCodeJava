package com.leetcode.algorithm.medium.mergeintervals;

import java.util.Objects;

class Interval {
  int start;
  int end;

  Interval() {
    start = 0;
    end = 0;
  }

  Interval(int s, int e) {
    start = s;
    end = e;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Interval)) {
      return false;
    }
    Interval interval = (Interval) o;
    return start == interval.start
        && end == interval.end;
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }
}
