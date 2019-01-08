package com.leetcode.algorithm.hard.countofsmallernumbersafterself;

import java.util.ArrayList;
import java.util.List;

class Solution {
//  public List<Integer> countSmaller(int[] nums) {
//    int n = nums.length;
//    int [] temp = new int[n];
//    List<Integer> result = new ArrayList<>();
//
//    for (int i = n -1; i >= 0; i--) {
//      int pos = insert(temp, result.size(), nums[i]);
//      result.add(0, pos);
//    }
//
//    return result;
//  }
//
//  private int insert(int[] arr, int n, int num) {
//    int lo = 0;
//    int hi = n;
//    while (lo != hi) {
//      int mid = lo + (hi - lo) / 2;
//      if (arr[mid] < num) {
//        lo = mid + 1;
//      } else {
//        hi = mid;
//      }
//    }
//
//    for (int i = n; i > lo; i--) {
//       arr[i] = arr[i - 1];
//    }
//
//    arr[lo] = num;
//
//    return lo;
//  }

  public List<Integer> countSmaller(int[] nums) {
    int n = nums.length;

    int[] indexes = new int[n];
    for (int i = 0; i < n; i++) {
      indexes[i] = i;
    }

    int[] count = new int[n];

    mergesort(nums, indexes, count, 0, n - 1);

    List<Integer> result = new ArrayList<>();
    for (int val: count) {
      result.add(val);
    }

    return result;
  }

  private void mergesort(int[] nums, int[] indexes, int[] count, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = start + (end - start) / 2;
    mergesort(nums, indexes, count, start, mid);
    mergesort(nums, indexes, count, mid + 1, end);
    merge(nums, indexes, count, start, end);
  }

  private void merge(int[] nums, int[] indexes, int[] count, int left, int right) {
    int mid = left + (right - left) / 2;
    int l = left;
    int r = mid + 1;
    int rightcount = 0;
    int cur = 0;
    int[] newIndexes = new int[right - left + 1];

    while (l <= mid && r <= right) {
      if (nums[indexes[r]] < nums[indexes[l]]) {
        newIndexes[cur++] = indexes[r++];
        rightcount++;
      } else {
        newIndexes[cur++] = indexes[l];
        count[indexes[l]] += rightcount;
        l++;
      }
    }

    while (l <= mid) {
      newIndexes[cur++] = indexes[l];
      count[indexes[l]] += rightcount;
      l++;
    }

    while (r <= right) {
      newIndexes[cur++] = indexes[r++];
    }

    for (int i = 0; i < newIndexes.length; i++) {
      indexes[left + i] = newIndexes[i];
    }
  }
}
