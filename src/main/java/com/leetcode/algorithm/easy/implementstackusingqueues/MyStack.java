package com.leetcode.algorithm.easy.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
  Queue<Integer> q1 = new LinkedList<>();
  Queue<Integer> q2 = new LinkedList<>();
  private int top;

  /** Initialize your data structure here. */
  public MyStack() {

  }

  /** Push element x onto stack. */
  public void push(int x) {
    q2.add(x);
    top = x;
    while (!q1.isEmpty()) {
      q2.offer(q1.poll());
    }
    Queue<Integer> temp = q1;
    q1 = q2;
    q2 = temp;
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    int ans = q1.remove();
    if (!q1.isEmpty()) {
      top = q1.peek();
    }
    return ans;
  }

  /** Get the top element. */
  public int top() {
    return top;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return q1.isEmpty();
  }
}
