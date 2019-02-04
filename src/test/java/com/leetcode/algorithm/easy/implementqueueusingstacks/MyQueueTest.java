package com.leetcode.algorithm.easy.implementqueueusingstacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyQueueTest {
  @Test
  public void testCase1() {
    MyQueue queue = new MyQueue();

    queue.push(1);
    queue.push(2);
    assertEquals(1, queue.peek());
    assertEquals(1, queue.pop());
    assertEquals(false, queue.empty());
  }
}
