package com.leetcode.algorithm.medium.rectanglearea;

class Solution {
  public int computeArea(int a, int b, int c, int d, int e, int f, int g, int h) {
    int x = Math.min(g, c) > Math.max(e, a) ? (Math.min(g, c) - Math.max(e, a)) : 0;
    int y = Math.min(d, h) > Math.max(b, f) ? (Math.min(d, h) - Math.max(b, f)) : 0;
    return (d - b) * (c - a) + (g - e) * (h - f) - x * y;
  }
}
