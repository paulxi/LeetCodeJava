package com.leetcode.algorithm.common;

import java.util.Objects;

public class Point {
  public int x;
  public  int y;

  public Point() {
    x = 0;
    y = 0;
  }

  public Point(int a, int b) {
    x = a;
    y = b;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Point)) {
      return false;
    }

    Point p = (Point)o;
    return p.x == x && p.y == y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
