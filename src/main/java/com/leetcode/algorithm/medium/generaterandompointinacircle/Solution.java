package com.leetcode.algorithm.medium.generaterandompointinacircle;

class Solution {
  double rad, xc, yc;

  public Solution(double radius, double x_center, double y_center) {
    rad = radius;
    xc = x_center;
    yc = y_center;
  }

  public double[] randPoint() {
    double d = rad * Math.sqrt(Math.random());
    double theta = Math.random() * 2 * Math.PI;

    return new double[] {d * Math.cos(theta) + xc, d * Math.sin(theta) + yc};
  }
}
