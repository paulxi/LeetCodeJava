package com.leetcode.algorithm.medium.graycode;

import java.util.LinkedList;
import java.util.List;

class Solution {
//  public List<Integer> grayCode(int num) {
//    List<Integer> result = new LinkedList<>();
//    for (int i = 0; i < 1<<num; i++) result.add(i ^ i>>1);
//    return result;
//  }

  public List<Integer> grayCode(int num) {
    List<Integer> result = new LinkedList<>();
    result.add(0);
    for (int i = 0; i < num; i++) {
      int size = result.size();
      for (int k = size - 1; k >= 0; k--) {
        result.add(result.get(k) | 1 << i);
      }
    }
    return result;
  }
}
