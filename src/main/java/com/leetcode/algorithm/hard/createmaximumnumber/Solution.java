package com.leetcode.algorithm.hard.createmaximumnumber;

import java.util.Stack;

class Solution {
  public int[] maxNumber(int[] nums1, int[] nums2, int k) {
    int n = nums1.length;
    int m = nums2.length;
    int[] ans = new int[k];
    for (int i = Math.max(0, k - m); i <= k && i <= n; i++) {
      int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
      if (greater(candidate, 0, ans, 0)) {
        ans = candidate;
      }
    }

    return ans;
  }

  private int[] merge(int[] nums1, int[] nums2, int k) {
    int[] ans = new int[k];
    for (int i = 0, j = 0, r = 0; r < k; r++) {
      ans[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
    }
    return ans;
  }

  private int[] maxArray(int[] nums, int k) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < nums.length; i++) {
      while (stack.size() + nums.length - i > k && !stack.empty() && stack.peek() < nums[i]) {
        stack.pop();
      }

      if (stack.size() < k) {
        stack.push(nums[i]);
      }
    }

    int[] result = new int[k];
    for (int i = k - 1; i >= 0; i--) {
      result[i] = stack.pop();
    }
    return result;
  }

  private boolean greater(int[] nums1, int i, int[] nums2, int j) {
    while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
      i++;
      j++;
    }

    return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
  }
}
