package com.leetcode.algorithm.medium.flatten2dvector;

import java.util.Iterator;
import java.util.List;

public class Vector2D implements Iterator<Integer> {

  private int x = 0;
  private int y = 0;
  private List<List<Integer>> vec2d;

  public Vector2D(List<List<Integer>> vec2d) {
    this.vec2d = vec2d;
  }

  @Override
  public Integer next() {
    int result = vec2d.get(x).get(y);
    y++;
    return result;
  }

  @Override
  public boolean hasNext() {
    while (x < vec2d.size()) {
      if (y < vec2d.get(x).size()) {
        return true;
      }
      x++;
      y = 0;
    }

    return false;
  }
}
