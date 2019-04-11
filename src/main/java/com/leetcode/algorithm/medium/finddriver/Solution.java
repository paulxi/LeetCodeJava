package com.leetcode.algorithm.medium.finddriver;

import com.leetcode.algorithm.common.Segment;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int findDriver(List<Segment> travelTime) {
    int maxTime = 0;
    int driver = -1;

    Collections.sort(travelTime, (o1, o2) -> o1.start - o2.start);

    Map<Integer, int[]> map = new HashMap<>();
    for (Segment s: travelTime) {
      if (!map.containsKey(s.driverID)) {
        map.put(s.driverID, new int[] {s.end, s.end - s.start });
      } else {
        int[] time = map.get(s.driverID);
        if (s.start > time[0]) {
          time[1] = s.end - s.start;
        } else {
          if (s.end > time[0]) {
            time[1] += s.end - time[0];
          }
        }

        time[0] = Math.max(time[0], s.end);
      }

      if (map.get(s.driverID)[1] > maxTime) {
        driver = s.driverID;
        maxTime = map.get(s.driverID)[1];
      }
    }

    return driver;
  }
}
