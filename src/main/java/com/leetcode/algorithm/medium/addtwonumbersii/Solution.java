package com.leetcode.algorithm.medium.addtwonumbersii;

import com.leetcode.algorithm.common.ListNode;

import java.util.Stack;

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    Stack<Integer> stack1 = create(l1);
    Stack<Integer> stack2 = create(l2);

    ListNode curr = null;
    int carry = 0;
    while (!stack1.isEmpty() || !stack2.isEmpty()) {
      int val1 = stack1.isEmpty() ? 0 : stack1.pop();
      int val2 = stack2.isEmpty() ? 0 : stack2.pop();

      int sum = val1 + val2 + carry;
      int val = sum % 10;
      carry = sum / 10;

      ListNode temp = new ListNode(val);
      temp.next = curr;
      curr = temp;
    }

    if (carry > 0) {
      ListNode temp = new ListNode(carry);
      temp.next = curr;
      curr = temp;
    }

    return curr;
  }

  private Stack<Integer> create(ListNode l) {
    Stack<Integer> stack = new Stack<>();
    while (l != null) {
      stack.push(l.val);
      l = l.next;
    }

    return stack;
  }
}
