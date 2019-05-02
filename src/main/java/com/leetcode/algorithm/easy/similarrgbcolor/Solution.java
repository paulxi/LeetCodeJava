package com.leetcode.algorithm.easy.similarrgbcolor;

class Solution {
  public String similarRGB(String color) {
    return "#" + f(color.substring(1, 3)) + f(color.substring(3, 5)) + f(color.substring(5, 7));
  }

  private String f(String comp) {
    int q = Integer.parseInt(comp, 16);
    q = q / 17 + (q % 17 > 8 ? 1 : 0);
    return String.format("%02x", q * 17);
  }
}
