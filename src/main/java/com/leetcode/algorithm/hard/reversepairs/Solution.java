package com.leetcode.algorithm.hard.reversepairs;

class Solution {
  public int reversePairs(int[] nums) {
    return mergeSort(nums, 0, nums.length - 1);
  }

  private int mergeSort(int[] nums, int left, int right) {
    if (right <= left) {
      return 0;
    }

    int mid = left + (right - left) / 2;
    int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

    for (int l = left, r = mid + 1; l <= mid; l++) {
      while (r <= right && nums[l] / 2.0 > nums[r]) {
        r++;
      }

      count += r - (mid + 1);
    }

    int[] temp = new int[right - left + 1];
    for (int l = left, r = mid + 1, k = 0; l <= mid || r <= right; ) {
      if (l <= mid && ((r > right) || nums[l] < nums[r])) {
        temp[k++] = nums[l++];
      } else {
        temp[k++] = nums[r++];
      }
    }

    for (int i = 0; i < temp.length; i++) {
      nums[left + i] = temp[i];
    }

    return count;
  }
}
