package com.leetcode.algorithm.hard.maxpointsonaline;

import com.leetcode.algorithm.common.Point;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public int maxPoints(Point[] points) {
    if (points.length == 0) {
      return 0;
    }
    if (points.length <= 2) {
      return points.length;
    }

    int result = 0;
    for (int i = 0; i < points.length; i++) {
      HashMap<BigDecimal, Integer> map = new HashMap<>();
      int samePoint = 1;
      for (int j = i + 1; j < points.length; j++) {
        if (points[i].x == points[j].x && points[i].y == points[j].y) {
          samePoint++;
        } else if (points[i].x == points[j].x) {
          BigDecimal key = BigDecimal.valueOf(Double.MAX_VALUE);
          int count = map.getOrDefault(key, 0) + 1;
          map.put(key, count);
        } else {
          BigDecimal yDiff = BigDecimal.valueOf(points[i].y - points[j].y);
          BigDecimal xDiff = BigDecimal.valueOf(points[i].x - points[j].x);
          BigDecimal key = yDiff.divide(xDiff, new MathContext(20));

          int count = map.getOrDefault(key, 0) + 1;
          map.put(key, count);
        }
      }

      int max = 0;
      for (BigDecimal key : map.keySet()) {
        max = Math.max(max, map.get(key));
      }
      max += samePoint;
      result = Math.max(result, max);
    }

    return result;
  }
}
