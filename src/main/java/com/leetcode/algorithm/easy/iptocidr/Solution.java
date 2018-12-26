package com.leetcode.algorithm.easy.iptocidr;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> ipToCIDR(String ip, int n) {
    long x = 0;
    String[] ips = ip.split("\\.");
    for (int i = 0; i < ips.length; i++) {
      x = Integer.valueOf(ips[i]) + x * 256;
    }

    int range = n;
    List<String> ans = new ArrayList<>();
    while (range > 0) {
      long step = x & -x;
      while (step > range) step /= 2;
      ans.add(longToIP(x, (int)step));
      x += step;
      range -= step;
    }

    return ans;
  }

  private String longToIP(long x, int step) {
    int[] ans = new int[4];
    ans[0] = (int) (x & 255);
    x >>= 8;
    ans[1] = (int) (x & 255);
    x >>= 8;
    ans[2] = (int) (x & 255);
    x >>= 8;
    ans[3] = (int) x;

    int len = 33;
    while (step > 0) {
      len--;
      step /= 2;
    }
    return ans[3] + "." + ans[2] + "." + ans[1] + "." + ans[0] + "/" + len;
  }
}
