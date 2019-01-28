package com.leetcode.algorithm.medium.findkclosestelements;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> findClosestElements(int[] arr, int k, int x) {
    ArrayList<Integer> list = new ArrayList<>();
    if (x <= arr[0]) {
      for (int i = 0; i < k; i++) {
        list.add(arr[i]);
      }
      return list;
    }

    int len = arr.length;

    if (x >= arr[arr.length - 1]) {
      for (int i = len - k; i < len; i++) {
        list.add(arr[i]);
      }
      return list;
    }

    int lo = 0;
    int hi = len - k;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (x - arr[mid] > arr[mid + k] - x) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }

    for (int i = lo; i < lo + k; i++) {
      list.add(arr[i]);
    }

    return list;
  }
}
