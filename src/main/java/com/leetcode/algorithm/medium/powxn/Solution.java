package com.leetcode.algorithm.medium.powxn;

class Solution {
  public double myPow(double x, int n) {
    long power = n;
    power = Math.abs(power);
    double num = n < 0 ? (1 / x) : x;

    double result = 1;
    double production = num;
    for (long i = power; i > 0; i /= 2) {
      if (i % 2 == 1) {
        result *= production;
      }

      production *= production;
    }
    return result;
  }
}
