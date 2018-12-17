package com.leetcode.algorithm.easy.twosumiii;

import java.util.HashMap;

class TwoSum {
  private HashMap<Integer, Integer> map = new HashMap<>();

  /** Initialize your data structure here. */
  public TwoSum() {

  }

  /** Add the number to an internal data structure.. */
  public void add(int number) {
    if (map.containsKey(number)) {
      map.put(number, 2);
    } else {
      map.put(number, 1);
    }
  }

  /** Find if there exists any pair of numbers which sum is equal to the value. */
  public boolean find(int value) {
    for (int x: map.keySet()) {
      int y = value - x;
      if (map.containsKey(y) && (x != y || map.get(y) == 2)) {
        return true;
      }
    }
    return false;
  }
}
