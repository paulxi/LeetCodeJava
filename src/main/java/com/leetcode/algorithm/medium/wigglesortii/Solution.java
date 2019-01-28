package com.leetcode.algorithm.medium.wigglesortii;

import java.util.Random;

class Solution {
  public void wiggleSort(int[] nums) {
    // https://leetcode.com/problems/wiggle-sort-ii/discuss/77682/Step-by-step-explanation-of-index-mapping-in-Java
    int median = findKthLargest(nums, (nums.length + 1) / 2);
    int n = nums.length;

    int left = 0;
    int right = nums.length - 1;
    int i = 0;
    while (i <= right) {
      int index = newIndex(i, n);
      if (nums[index] > median) {
        int leftIndex = newIndex(left, n);
        swap(nums, leftIndex, index);
        left++;
        i++;
      } else if (nums[index] < median) {
        int rightIndex = newIndex(right, n);
        swap(nums, rightIndex, index);
        right--;
      } else {
        i++;
      }
    }
  }

  private int findKthLargest(int[] nums, int k) {
    int size = nums.length;
    return quickselect(nums, 0, size - 1, size - k);
  }

  private int quickselect(int[] nums, int left, int right, int k_smallest) {
    if (left == right) {
      return nums[left];
    }

    Random random = new Random();
    int pivot_index = left + random.nextInt(right - left);
    pivot_index = partition(nums, left, right, pivot_index);
    if (k_smallest == pivot_index) {
      return nums[k_smallest];
    } else if (k_smallest < pivot_index) {
      return quickselect(nums, left, pivot_index - 1, k_smallest);
    } else {
      return quickselect(nums, pivot_index + 1, right, k_smallest);
    }
  }

  private int partition(int[] nums, int left, int right, int pivot_index) {
    int pivot = nums[pivot_index];
    swap(nums, pivot_index, right);
    int store_index = left;

    for (int i = left; i <= right; i++) {
      if (nums[i] < pivot) {
        swap(nums, store_index, i);
        store_index++;
      }
    }

    swap(nums, store_index, right);
    return store_index;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private int newIndex(int index, int n) {
    return (1 + 2 * index) % (n | 1);
  }
}
