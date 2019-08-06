package com.leetcode.algorithm.medium.videostitching;

import java.util.Arrays;

class Solution {
  public int videoStitching(int[][] clips, int t) {
    int ans = 0;
    Arrays.sort(clips, (a, b) -> a[0] - b[0]);
    int end = 0;
    int i = 0;
    while (end < t) {
      int max = end;
      while (i < clips.length && clips[i][0] <= end) {
        max = Math.max(max, clips[i][1]);
        i++;
      }

      if (end == max) {
        return -1;
      }

      end = max;
      ans++;
    }

    return ans;
  }
}
