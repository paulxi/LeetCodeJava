package com.leetcode.algorithm.medium.designcircularqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyCircularQueueTest {
  @Test
  public void testCase1() {
    MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
    assertEquals(true, circularQueue.enQueue(1));  // return true
    assertEquals(true, circularQueue.enQueue(2));  // return true
    assertEquals(true, circularQueue.enQueue(3));  // return true
    assertEquals(false, circularQueue.enQueue(4));  // return false, the queue is full
    assertEquals(3, circularQueue.Rear());  // return 3
    assertEquals(true, circularQueue.isFull());  // return true
    assertEquals(true, circularQueue.deQueue());  // return true
    assertEquals(true, circularQueue.enQueue(4));  // return true
    assertEquals(4, circularQueue.Rear());  // return 4
  }
}
