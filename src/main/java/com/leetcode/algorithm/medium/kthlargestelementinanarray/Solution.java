package com.leetcode.algorithm.medium.kthlargestelementinanarray;

import java.util.Random;

class Solution {
  public int findKthLargest(int[] nums, int k) {
    int n = nums.length;
    return quickselect(nums, n - k, 0, n - 1);
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private int partition(int[] nums, int pIndex, int left, int right) {
    int pivot = nums[pIndex];
    swap(nums, pIndex, right);
    int index = left;

    for (int i = left; i <= right; i++) {
      if (nums[i] < pivot) {
        swap(nums, i, index);
        index++;
      }
    }

    swap(nums, index, right);

    return index;
  }

  private int quickselect(int[] nums, int kSmallest, int left, int right) {
    if (left == right) {
      return nums[left];
    }

    Random random = new Random();
    int pIndex = left + random.nextInt(right - left);

    int index = partition(nums, pIndex, left, right);
    if (index == kSmallest) {
      return nums[index];
    } else if (index < kSmallest) {
      return quickselect(nums, kSmallest, index + 1, right);
    }
    return quickselect(nums, kSmallest, left, index - 1);
  }
}
