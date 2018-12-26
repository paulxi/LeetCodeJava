package com.leetcode.algorithm.medium.reversewordsinastring;

public class Solution {
  public String reverseWords(String s) {
    String[] items = s.trim().split(" +");
    int lo = 0;
    int hi = items.length - 1;
    while (lo < hi) {
      String temp = items[lo];
      items[lo] = items[hi];
      items[hi] = temp;
      lo++;
      hi--;
    }

    return String.join(" ", items);
  }
}
