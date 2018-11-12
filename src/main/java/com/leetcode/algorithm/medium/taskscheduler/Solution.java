package com.leetcode.algorithm.medium.taskscheduler;

import java.util.Arrays;

class Solution {
  public int leastInterval(char[] tasks, int n) {
    int[] map = new int[26];
    for (char task : tasks) {
      map[task - 'A']++;
    }
    Arrays.sort(map);

    int times = 0;
    while (map[25] > 0) {
      int i = 0;
      while (i <= n) {
        if (map[25] == 0) {
          break;
        }
        if (i < 26 && map[25 - i] > 0) {
          map[25 - i]--;
        }
        times++;
        i++;
      }

      Arrays.sort(map);
    }

    return times;
  }
}
