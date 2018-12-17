package com.leetcode.algorithm.medium.dailytemperatures;

import java.util.Arrays;
import java.util.Stack;

class Solution {
//  public int[] dailyTemperatures(int[] temperatures) {
//    int[] result = new int[temperatures.length];
//    int next = 1;
//    for (int i = 0; i < temperatures.length; i++) {
//      if (i > 0 && temperatures[i] < temperatures[i - 1]) {
//        next = i + 1;
//      }
//      while (next < temperatures.length) {
//        if (temperatures[next] > temperatures[i]) {
//          result[i] = next - i;
//          break;
//        }
//        next += 1;
//      }
//    }
//
//    return result;
//  }

//  public int[] dailyTemperatures(int[] T) {
//    int[] ans = new int[T.length];
//    int[] next = new int[101];
//    Arrays.fill(next, Integer.MAX_VALUE);
//    for (int i = T.length - 1; i >= 0; --i) {
//      int warmer_index = Integer.MAX_VALUE;
//      for (int t = T[i] + 1; t <= 100; ++t) {
//        if (next[t] < warmer_index)
//          warmer_index = next[t];
//      }
//      if (warmer_index < Integer.MAX_VALUE)
//        ans[i] = warmer_index - i;
//      next[T[i]] = i;
//    }
//    return ans;
//  }

//  public int[] dailyTemperatures(int[] T) {
//    int[] ans = new int[T.length];
//    int[] next = new int[101];
//    Arrays.fill(next, Integer.MAX_VALUE);
//    for (int i = 0; i < T.length; i++) {
//      next[T[i]] = i;
//    }
//    for (int i = 0; i < T.length; i++) {
//      int warmer_index = Integer.MAX_VALUE;
//      for (int t = T[i] + 1; t <= 100; t++) {
//        if (next[t] < warmer_index && next[t] > i) {
//          warmer_index = next[t];
//        }
//      }
//      if (warmer_index < Integer.MAX_VALUE) {
//        ans[i] = warmer_index - i;
//      }
//    }
//    return ans;
//  }

  public int[] dailyTemperatures(int[] T) {
    int[] ans = new int[T.length];
    Stack<Integer> stack = new Stack<>();
    for (int i = T.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
        stack.pop();
      }
      ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
      stack.push(i);
    }
    return ans;
  }
}
