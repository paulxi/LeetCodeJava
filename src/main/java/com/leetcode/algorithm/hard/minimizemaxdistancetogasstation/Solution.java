package com.leetcode.algorithm.hard.minimizemaxdistancetogasstation;

class Solution {
  public double minmaxGasDist(int[] stations, int k) {
    double lo = 0;
    double hi = 1e8;

    while (hi - lo > 1e-6) {
      double mi = lo + (hi - lo) / 2;
      if (possible(mi, stations, k)) {
        hi = mi;
      } else {
        lo = mi;
      }
    }

    return lo;
  }

  private boolean possible(double d, int[] stations, int k) {
    int used = 0;
    for (int i = 0; i < stations.length - 1; i++) {
      used += (int)((stations[i + 1] - stations[i]) / d);
    }

    return used <= k;
  }
}
