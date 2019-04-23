package com.leetcode.algorithm.easy.nthdigit;

class Solution {
  public int findNthDigit(int n) {
    n -= 1;
    int len = 1;
    long count = 9;
    int start = 1;

    while (n > len * count) {
      n -= len * count;
      len += 1;
      count *= 10;
      start *= 10;
    }

    int target = start + n / len;
    int remainder = n % len;
    return String.valueOf(target).charAt(remainder) - '0';
  }
}
