package com.leetcode.algorithm.hard.rectangleareaii;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

class Solution {
  private static class Interval {
    public int start;
    public int end;
    public Interval(int start, int end) {
      this.start = start;
      this.end = end;
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
      return start == interval.start &&
          end == interval.end;
    }

    @Override
    public int hashCode() {
      return Objects.hash(start, end);
    }
  }

  public int rectangleArea(int[][] rectangles) {
    int open = 0;
    int close = 1;
    int[][] events = new int[rectangles.length * 2][4];

    int t = 0;
    for (int[] rec: rectangles) {
      events[t++] = new int[] {rec[1], open, rec[0], rec[2]};
      events[t++] = new int[] {rec[3], close, rec[0], rec[2]};
    }

    Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

    TreeMap<Interval, Integer> active = new TreeMap<>((a, b) -> {
      if (a.start != b.start) {
        return a.start - b.start;
      } else {
        return a.end - b.end;
      }
    });

    int currentY = events[0][0];
    long ans = 0;
    for (int[] event: events) {
      int y = event[0];
      int typ = event[1];
      int x1 = event[2];
      int x2 = event[3];

      if (y > currentY) {
        ans += calculateInterval(active) * (y - currentY);
        currentY = y;
      }

      if (typ == 0) {
        addInterval(active, x1, x2);
      } else {
        removeInterval(active, x1, x2);
      }
    }

    ans %= 1000000007;
    return (int)ans;
  }

  private void addInterval(TreeMap<Interval, Integer> map, int x1, int x2) {
    Interval interval = new Interval(x1, x2);
    map.put(interval, map.getOrDefault(interval, 0) + 1);
  }

  private void removeInterval(TreeMap<Interval, Integer> map, int x1, int x2) {
    Interval interval = new Interval(x1, x2);
    map.put(interval, map.get(interval) - 1);
    if (map.get(interval) == 0) {
      map.remove(interval);
    }
  }

  private long calculateInterval(TreeMap<Interval, Integer> map) {
    long query = 0;
    int cur = -1;
    for (Interval interval: map.keySet()) {
      cur = Math.max(cur, interval.start);
      query += Math.max(interval.end - cur, 0);
      cur = Math.max(cur, interval.end);
    }

    return query;
  }
}
