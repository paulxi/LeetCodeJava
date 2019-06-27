package com.leetcode.algorithm.hard.countofrangesum;

class Solution {
  int count = 0;
  int lower;
  int upper;
  public int countRangeSum(int[] nums, int lower, int upper) {
    int n = nums.length;
    long[] sum = new long[n + 1];
    long[] temp = new long[n + 1];
    this.lower = lower;
    this.upper = upper;

    for (int i = 0; i < n; i++) {
      sum[i + 1] = sum[i] + nums[i];
    }

    mergesort(sum, 0,sum.length - 1, temp);
    return count;
  }

  private void mergesort(long[] sum, int start, int end, long[] temp) {
    if (start >= end) {
      return;
    }
    int mid = start + (end - start) / 2;
    mergesort(sum, start, mid, temp);
    mergesort(sum, mid + 1, end, temp);
    merge(sum, start, mid, end, temp);
  }

  private void merge(long[] sum, int start, int mid, int end, long[] temp) {
    int right = mid + 1;
    int index = start;
    int low = mid + 1;
    int high = mid + 1;

    for (int left = start; left <= mid; left++) {
      while (low <= end && sum[low] - sum[left] < lower) {
        low++;
      }
      while (high <= end && sum[high] - sum[left] <= upper) {
        high++;
      }

      while (right <= end && sum[right] < sum[left]) {
        temp[index++] = sum[right++];
      }
      temp[index++] = sum[left];
      count += high - low;
    }
    while (right <= end) {
      temp[index++] = sum[right++];
    }
    for (int i = start; i <= end; i++) {
      sum[i] = temp[i];
    }
  }
}
