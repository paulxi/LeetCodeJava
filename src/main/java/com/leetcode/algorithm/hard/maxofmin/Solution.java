package com.leetcode.algorithm.hard.maxofmin;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    //Given an integer array of size n, find the maximum of the minimum(s) of every window size in the array. The window size varies from 1 to n.

    //{1,2,3,4,6,7,10,8} {100,4,6,200, 60, 70}
    //{1},{2},{3},{4}..{8}
    //1    2   3   4  10  8 -> 10
    //{1,2}, {2,3}, {3,4}, {4,6}, {6,7}, {7,10}, {10,8}
    //  1      2      3      4      6      7       8 -> 8
    //{1,2,3, {2,3,4}, {3,4,6}, {6,7,10}, {7,10,9} -> 7

    Solution solution = new Solution();
    int[] ans = solution.maxOfMin(new int[] {100,4,6,200, 60, 70});
    for (int x: ans) {
      System.out.println(x);
    }

    ans = solution.maxOfMinN(new int[] {10, 20, 30, 50, 10, 70, 30});
    for (int x: ans) {
      System.out.println(x);
    }
  }

  private int[] maxOfMin(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];

    for (int w = 1; w <= n; w++) {
      Deque<Integer> deque = new ArrayDeque<>();
      int max = Integer.MIN_VALUE;

      for (int i = 0; i < n; i++) {
        // remove the index which is out of window
        while (!deque.isEmpty() && i - deque.peek() >= w) {
          deque.poll();
        }

        // remove the index which is larger than current number
        while (!deque.isEmpty() && nums[i] < nums[deque.peekLast()]) {
          deque.pollLast();
        }

        deque.offer(i);

        if (i + 1 >= w) {
          max = Math.max(max, nums[deque.peek()]);
        }
      }

      ans[w - 1] = max;
    }

    return ans;
  }

  private int[] maxOfMinN(int[] arr) {
    int n = arr.length;
    // Used to find previous and next smaller
    Stack<Integer> s = new Stack<>();

    // Arrays to store previous and next smaller
    int[] left = new int[n + 1];
    int[] right  = new int[n + 1];

    // Initialize elements of left[] and right[]
    Arrays.fill(left, -1);
    Arrays.fill(right, n);

    // Fill elements of left[] using logic discussed on
    // https://www.geeksforgeeks.org/next-greater-element/
    for (int i = 0; i < n; i++) {
      while (!s.empty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }

      if (!s.empty()) {
        left[i] = s.peek();
      }

      s.push(i);
    }

    // Empty the stack as stack is going to be used for right[]
    while (!s.empty()) {
      s.pop();
    }

    // Fill elements of right[] using same logic
    for (int i = n - 1; i >= 0; i--) {
      while (!s.empty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }

      if (!s.empty()) {
        right[i] = s.peek();
      }

      s.push(i);
    }

    // Create and initialize answer array
    int[] ans = new int[n + 1];

    // Fill answer array by comparing minimums of all
    // lengths computed using left[] and right[]
    for (int i = 0; i < n; i++) {
      // length of the interval
      int len = right[i] - left[i] - 1;

      // arr[i] is a possible answer for this length
      // 'len' interval, check if arr[i] is more than
      // max for 'len'
      ans[len] = Math.max(ans[len], arr[i]);
    }

    // Some entries in ans[] may not be filled yet. Fill
    // them by taking values from right side of ans[]
    for (int i = n - 1; i >= 1; i--) {
      ans[i] = Math.max(ans[i], ans[i + 1]);
    }

    return ans;
  }
}
