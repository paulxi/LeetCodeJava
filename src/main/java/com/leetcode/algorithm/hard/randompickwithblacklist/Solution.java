package com.leetcode.algorithm.hard.randompickwithblacklist;

import java.util.*;

class Solution {
  HashMap<Integer, Integer> map = new HashMap<>();
  Random rand = new Random();
  int wlen;

  public Solution(int n, int[] blacklist) {
    wlen = n - blacklist.length;
    Set<Integer> set = new HashSet<>();
    for (int i = wlen; i < n; i++) {
      set.add(i);
    }
    for (int x: blacklist) {
      set.remove(x);
    }

    Iterator<Integer> wi = set.iterator();
    for (int x: blacklist) {
      if (x < wlen) {
        map.put(x, wi.next());
      }
    }

  }

  public int pick() {
    int k = rand.nextInt(wlen);
    return map.getOrDefault(k, k);
  }
}
