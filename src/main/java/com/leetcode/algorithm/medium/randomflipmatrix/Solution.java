package com.leetcode.algorithm.medium.randomflipmatrix;

import java.util.HashMap;
import java.util.Random;

class Solution {
  HashMap<Integer, Integer> map = new HashMap<>();
  Random rand = new Random();
  int nr, nc, rem;

  public Solution(int n_rows, int n_cols) {
    nr = n_rows;
    nc = n_cols;
    rem = nr * nc;
  }

  public int[] flip() {
    int r = rand.nextInt(rem);
    rem--;
    int x = map.getOrDefault(r, r);
    map.put(r, map.getOrDefault(rem, rem));
    return new int[] {x / nc, x % nc};
  }

  public void reset() {
    map.clear();
    rem = nr * nc;
  }
}
