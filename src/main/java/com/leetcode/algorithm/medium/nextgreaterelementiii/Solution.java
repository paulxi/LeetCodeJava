package com.leetcode.algorithm.medium.nextgreaterelementiii;

import java.util.Arrays;

class Solution {
  public int nextGreaterElement(int n) {
    char[] chars = ("" + n).toCharArray();

    int i = chars.length - 1;
    for (; i > 0; i--) {
      if (chars[i - 1] < chars[i]) {
        break;
      }
    }

    if (i == 0) {
      return -1;
    }

    int x = chars[i - 1];
    int smallest = i;
    for (int j = i + 1; j < chars.length; j++) {
      if (chars[j] > x && chars[j] <= chars[smallest]) {
        smallest = j;
      }
    }

    char temp = chars[i - 1];
    chars[i - 1] = chars[smallest];
    chars[smallest] = temp;

    int start = i;
    int end = chars.length - 1;
    while (start < end) {
      temp = chars[start];
      chars[start] = chars[end];
      chars[end] = temp;
      start++;
      end--;
    }

    long val = Long.parseLong(new String(chars));
    return val <= Integer.MAX_VALUE ? (int)val : -1;
  }
}
