package com.leetcode.algorithm.medium.randompickwithweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {
  List<Integer> psum = new ArrayList<>();
  int tot = 0;
  Random rand = new Random();

  public Solution(int[] w) {
    for (int x: w) {
      tot += x;
      psum.add(tot);
    }
  }

  public int pickIndex() {
    int targ = rand.nextInt(tot);

    int low = 0;
    int high = psum.size() - 1;
    while (low != high) {
      int mid = (low + high) / 2;
      if (targ >= psum.get(mid)) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }

    return low;
  }
}
