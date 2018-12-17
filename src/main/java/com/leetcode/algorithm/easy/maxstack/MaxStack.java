package com.leetcode.algorithm.easy.maxstack;

import java.util.Stack;

class MaxStack {
  Stack<Integer> stack = new Stack<>();
  Stack<Integer> maxStack = new Stack<>();

  /** initialize your data structure here. */
  public MaxStack() {

  }

  public void push(int x) {
    stack.push(x);
    if (maxStack.isEmpty()) {
      maxStack.push(x);
    } else {
      int max = maxStack.peek();
      if (x > max) {
        maxStack.push(x);
      } else {
        maxStack.push(max);
      }
    }
  }

  public int pop() {
    maxStack.pop();
    return stack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int peekMax() {
    return maxStack.peek();
  }

  public int popMax() {
    Stack<Integer> temp = new Stack<>();
    int max = maxStack.peek();
    while (stack.peek() != max) {
      temp.push(pop());
    }

    pop();
    while (!temp.isEmpty()) {
      push(temp.pop());
    }

    return max;
  }
}
