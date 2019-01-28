package com.leetcode.algorithm.easy.happynumber;

import java.util.HashSet;
import java.util.Set;

class Solution {
//  public boolean isHappy(int n) {
//    int num = n;
//    Set<Integer> set = new HashSet<>();
//
//    while (num != 1 && !set.contains(num)) {
//      set.add(num);
//
//      num = digitSquareSum(num);
//    }
//
//    return num == 1;
//  }

  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;

    do {
      slow = digitSquareSum(slow);
      fast = digitSquareSum(fast);
      fast = digitSquareSum(fast);
    } while (slow != fast);

    return slow == 1;
  }

  int digitSquareSum(int n) {
    int sum = 0, tmp;
    while (n > 0) {
      tmp = n % 10;
      sum += tmp * tmp;
      n /= 10;
    }
    return sum;
  }
}
