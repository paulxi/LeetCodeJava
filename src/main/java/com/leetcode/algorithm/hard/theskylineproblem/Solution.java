package com.leetcode.algorithm.hard.theskylineproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
  private final static class Point implements Comparable<Point> {
    private int pos;
    private int height;
    private boolean isStart;

    public Point(int pos, int height, boolean isStart) {
      this.pos = pos;
      this.height = height;
      this.isStart = isStart;
    }


    @Override
    public int compareTo(Point o) {
      if (this.pos != o.pos) {
        return this.pos - o.pos;
      } else {
        if (this.isStart && o.isStart) {
          return o.height - this.height;
        }
        if (!this.isStart && !o.isStart) {
          return this.height - o.height;
        }

        return this.isStart ? -1 : 1;
      }
    }
  }

  public List<int[]> getSkyline(int[][] buildings) {
    int len = buildings.length;
    if (len == 0 || buildings[0].length == 0) {
      return new ArrayList<>();
    }

    Point[] points = new Point[len * 2];
    int index = 0;
    for (int[] build : buildings) {
      int start = build[0];
      int end = build[1];
      int height = build[2];
      points[index] = new Point(start, height, true);
      index += 1;
      points[index] = new Point(end, height, false);
      index += 1;
    }

    Arrays.sort(points);
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer(0);
    List<int[]> result = new ArrayList<>();

    int prevMaxVal = 0;
    for (Point point : points) {
      if (point.isStart) {
        queue.offer(point.height);
        int curMaxVal = queue.peek();
        if (curMaxVal > prevMaxVal) {
          result.add(new int[] {point.pos, point.height});
          prevMaxVal = curMaxVal;
        }
      } else {
        queue.remove(point.height);
        int curMaxVal = queue.peek();
        if (curMaxVal < prevMaxVal) {
          result.add(new int[] {point.pos, curMaxVal});
          prevMaxVal = curMaxVal;
        }
      }
    }

    return result;
  }
}
