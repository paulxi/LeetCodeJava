package com.leetcode.algorithm.easy.fibonaccinumber;

class Solution {
  public int fib(int n) {
    int first = 0;
    int second = 1;

    if (n == 0) {
      return first;
    }

    if (n == 1) {
      return second;
    }

    int i = 2;
    while (i <= n) {
      int temp = first + second;
      first = second;
      second = temp;
      i++;
    }

    return second;
  }
}
