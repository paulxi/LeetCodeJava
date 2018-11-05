package com.leetcode.algorithm.easy.minstack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinStackTest {
  @Test
  public void testCase1() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    minStack.pop();
    assertEquals(-2, minStack.getMin());
  }
}
