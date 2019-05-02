package com.leetcode.algorithm.medium.validsquare;

class Solution {
  public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    int[] lengths =
        new int[] {
          dist(p1, p2), dist(p1, p3), dist(p1, p4), dist(p2, p3), dist(p2, p4), dist(p3, p4)
        };

    int max = 0;
    int nomax = Integer.MAX_VALUE;
    for (int len: lengths) {
      max = Math.max(max, len);
      nomax = Math.min(nomax, len);
    }

    int maxcount = 0;
    int nomaxcount = 0;
    for (int len: lengths) {
      if (len == max) {
        maxcount++;
      }
      if (len == nomax) {
        nomaxcount++;
      }
    }

    return maxcount == 2 && nomaxcount == 4;
  }

  private int dist(int[] p1, int[] p2) {
    return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
  }
}
