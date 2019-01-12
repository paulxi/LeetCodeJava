package com.leetcode.algorithm.medium.asteroidcollision;

import java.util.Stack;

class Solution {
  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> stack = new Stack<>();

    for (int a: asteroids) {
      if (stack.isEmpty() || a > 0) {
        stack.push(a);
      } else if (a < 0) {
        boolean flag = false;
        while (!stack.isEmpty() && stack.peek() > 0) {
          if (stack.peek() + a == 0) {
            flag = true;
            stack.pop();
            break;
          } else if (stack.peek() + a > 0) {
            flag = true;
            break;
          } else {
            stack.pop();
          }
        }

        if (!flag) {
          stack.push(a);
        }
      }
    }

    int[] result = new int[stack.size()];

    for (int i = stack.size() - 1; i >= 0; i--) {
      result[i] = stack.pop();
    }

    return result;
  }
}
