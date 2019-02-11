package com.leetcode.algorithm.medium.designcircularqueue;

class MyCircularQueue {
  final int[] a;
  int front = 0;
  int rear = -1;
  int length = 0;

  /** Initialize your data structure here. Set the size of the queue to be k. */
  public MyCircularQueue(int k) {
    a = new int[k];
  }

  /** Insert an element into the circular queue. Return true if the operation is successful. */
  public boolean enQueue(int value) {
    if (!isFull()) {
      rear = (rear + 1) % a.length;
      a[rear] = value;
      length++;
      return true;
    } else {
      return false;
    }
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  public boolean deQueue() {
    if (!isEmpty()) {
      front = (front + 1) % a.length;
      length--;
      return true;
    } else {
      return false;
    }
  }

  /** Get the front item from the queue. */
  public int Front() {
    if (!isEmpty()) {
      return a[front];
    }
    return -1;
  }

  /** Get the last item from the queue. */
  public int Rear() {
    if (!isEmpty()) {
      return a[rear];
    }
    return -1;
  }

  /** Checks whether the circular queue is empty or not. */
  public boolean isEmpty() {
    return length == 0;
  }

  /** Checks whether the circular queue is full or not. */
  public boolean isFull() {
    return length == a.length;
  }
}
