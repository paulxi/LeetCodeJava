package com.leetcode.algorithm.medium.mycalendarii;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class MyCalendarTwo {
//  private List<int[]> books = new ArrayList<>();
//
//  public MyCalendarTwo() {
//
//  }
//
//  public boolean book(int start, int end) {
//    MyCalendar overlap = new MyCalendar();
//    for (int[] b: books) {
//      if (Math.max(b[0], start) < Math.min(b[1], end)) {
//        if (!overlap.book(Math.max(b[0], start), Math.min(b[1], end))) {
//          return false;
//        }
//      }
//    }
//
//    books.add(new int[] {start, end});
//
//    return true;
//  }
//
//  private static class MyCalendar {
//    private List<int[]> books = new ArrayList<>();
//
//    public boolean book(int start, int end) {
//      for (int[] b: books) {
//        if (Math.max(b[0], start) < Math.min(b[1], end)) {
//          return false;
//        }
//      }
//
//      books.add(new int[] {start, end});
//
//      return true;
//    }
//  }

  TreeMap<Integer, Integer> delta;

  public MyCalendarTwo() {
    delta = new TreeMap<>();
  }

  public boolean book(int start, int end) {
    delta.put(start, delta.getOrDefault(start, 0) + 1);
    delta.put(end, delta.getOrDefault(end, 0) - 1);

    int activate = 0;
    for (int d: delta.values()) {
      activate += d;
      if (activate >= 3) {
        delta.put(start, delta.get(start) - 1);
        delta.put(end, delta.get(end) + 1);

        if (delta.get(start) == 0) {
          delta.remove(start);
        }

        if (delta.get(end) == 0) {
          delta.remove(end);
        }

        return false;
      }
    }

    return true;
  }
}
