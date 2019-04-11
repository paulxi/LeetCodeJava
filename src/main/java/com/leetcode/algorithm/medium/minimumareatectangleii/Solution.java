package com.leetcode.algorithm.medium.minimumareatectangleii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public double minAreaFreeRect(int[][] points) {
    int len = points.length;
    double res = Double.MAX_VALUE;
    if (len < 4) {
      return 0;
    }

    Map<String, List<int[]>> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        long dis =
            (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
        double centerX = (double) (points[j][0] + points[i][0]) / 2.0;
        double centerY = (double) (points[j][1] + points[i][1]) / 2.0;

        String key = "" + dis + "+" + centerX + "+" + centerY;
        if (!map.containsKey(key)) {
          map.put(key, new ArrayList<>());
        }
        map.get(key).add(new int[] {i, j});
      }
    }

    for (String key : map.keySet()) {
      List<int[]> list = map.get(key);
      if (list.size() > 1) {
        for (int i = 0; i < list.size(); i++) {
          for (int j = i + 1; j < list.size(); j++) {
            int p1 = list.get(i)[0];
            int p2 = list.get(j)[0];
            int p3 = list.get(j)[1];

            double len1 =
                Math.sqrt(
                    (points[p1][0] - points[p2][0]) * (points[p1][0] - points[p2][0])
                        + (points[p1][1] - points[p2][1]) * (points[p1][1] - points[p2][1]));
            double len2 =
                Math.sqrt(
                    (points[p1][0] - points[p3][0]) * (points[p1][0] - points[p3][0])
                        + (points[p1][1] - points[p3][1]) * (points[p1][1] - points[p3][1]));
            double area = len1 * len2;
            res = Math.min(res, area);
          }
        }
      }
    }

    return res == Double.MAX_VALUE ? 0.0 : res;
  }
}
