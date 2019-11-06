package com.leetcode.algorithm.medium.designboundedblockingqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class BoundedBlockingQueueTest {
  @Test
  public void testCase1() throws InterruptedException {
    BoundedBlockingQueue queue = new BoundedBlockingQueue(2);

    Thread t1 = new Thread(() -> {
      try {
        queue.enqueue(1);
        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
      } catch (Exception ex) {
        fail(ex);
      }
    });

    Thread t2 = new Thread(() -> {
      try {
        assertEquals(1, queue.dequeue());
        assertEquals(0, queue.dequeue());
        assertEquals(2, queue.dequeue());
      } catch (Exception ex) {
        fail(ex);
      }
    });

    t1.start();
    t2.start();

    try {
      Thread.sleep(100);
      assertEquals(2, queue.size());
    } catch (Exception ex) {
      fail(ex);
    }
  }
}
