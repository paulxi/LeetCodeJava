package com.leetcode.algorithm.easy.implementstackusingqueues;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyStackTest {
  @Test
  public void testCase1() {
    MyStack stack = new MyStack();

    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.top());
    assertEquals(2, stack.pop());
    assertEquals(false, stack.empty());
  }
}
