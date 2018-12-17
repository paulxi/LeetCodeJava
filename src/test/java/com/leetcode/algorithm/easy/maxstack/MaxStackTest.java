package com.leetcode.algorithm.easy.maxstack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxStackTest {
  @Test
  public void testCase1() {
    MaxStack stack = new MaxStack();
    stack.push(5);
    stack.push(1);
    stack.push(5);
    assertEquals(5, stack.top());
    assertEquals(5, stack.popMax());
    assertEquals(1, stack.top());
    assertEquals(5, stack.peekMax());
    assertEquals(1, stack.pop());
    assertEquals(5, stack.top());
  }

  @Test
  public void testCase2() {
    MaxStack stack = new MaxStack();
    stack.push(5);
    stack.push(1);
    stack.push(-5);
    assertEquals(5, stack.popMax());
    assertEquals(1, stack.popMax());
    assertEquals(-5, stack.top());
  }
}
