package com.leetcode.algorithm.hard.themazeiii;

import java.util.PriorityQueue;

class Solution {
  private static class Point implements Comparable<Point> {
    int x, y, l;
    String s;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
      l = Integer.MAX_VALUE;
      s = "";
    }

    public int compareTo(Point p) {
      if (l == p.l) {
        return s.compareTo(p.s);
      } else {
        return l - p.l;
      }
    }
  }

  public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
    int m = maze.length;
    int n = maze[0].length;
    Point[][] points = new Point[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        points[i][j] = new Point(i, j);
      }
    }

    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    String[] ds = new String[] {"r", "l", "d", "u"};

    PriorityQueue<Point> pq = new PriorityQueue<>();
    Point start = new Point(ball[0], ball[1]);
    start.l = 0;
    pq.offer(start);

    while (!pq.isEmpty()) {
      Point point = pq.poll();
      Point orig = points[point.x][point.y];
      if (orig.compareTo(point) <= 0) {
        continue;
      }

      points[point.x][point.y] = point;
      for (int i = 0; i < dirs.length; i++) {
        int[] dir = dirs[i];
        int x = point.x + dir[0];
        int y = point.y + dir[1];
        int l = point.l + 1;
        while (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0 &&
            (!(x == hole[0] && y == hole[1]))) {
          x += dir[0];
          y += dir[1];
          l++;
        }

        if (!(x == hole[0] && y == hole[1])) {
          x -= dir[0];
          y -= dir[1];
          l--;
        }
        Point p = new Point(x, y);
        p.l = l;
        p.s = point.s + ds[i];
        pq.offer(p);
      }
    }

    return points[hole[0]][hole[1]].l == Integer.MAX_VALUE ? "impossible" : points[hole[0]][hole[1]].s;
  }
}
