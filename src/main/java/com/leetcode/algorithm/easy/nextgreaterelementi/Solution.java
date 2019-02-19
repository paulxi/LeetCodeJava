package com.leetcode.algorithm.easy.nextgreaterelementi;

import java.util.*;

class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    for (int num: nums2) {
      while (!stack.isEmpty() && num > stack.peek()) {
        map.put(stack.pop(), num);
      }
      stack.push(num);
    }

    while (!stack.isEmpty()) {
      map.put(stack.pop(), -1);
    }

    int[] ans = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      ans[i] = map.get(nums1[i]);
    }

    return ans;
  }
}
