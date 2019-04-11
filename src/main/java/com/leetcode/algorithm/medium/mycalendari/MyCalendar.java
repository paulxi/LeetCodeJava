package com.leetcode.algorithm.medium.mycalendari;

import java.util.TreeMap;

public class MyCalendar {
  private TreeMap<Integer, Integer> treeMap = new TreeMap<>();

  public MyCalendar() {

  }

  public boolean book(int start, int end) {
    Integer prev = treeMap.floorKey(start);
    Integer next = treeMap.ceilingKey(start);

    if ((prev == null || treeMap.get(prev) <= start) && (next == null || next >= end)) {
      treeMap.put(start, end);
      return true;
    }

    return false;
  }
}
