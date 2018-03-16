package com.leetcode.algorithm.medium.addtwonumbers;

class Solution {

  /**
   * You are given two non-empty linked lists representing two non-negative integers.
   * The digits are stored in reverse order and each of their nodes contain a single digit.
   * Add the two numbers and return it as a linked list.
   * @param l1 list node 1
   * @param l2 list node 2
   * @return a new list node
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }

    ListNode l3 = add(l1, l2.val);
    l3.next = addTwoNumbers(l3.next, l2.next);
    return l3;
  }

  private ListNode add(ListNode node, int value) {
    if (node == null) {
      return new ListNode(value);
    }
    int sum = node.val + value;
    ListNode result = new ListNode(sum % 10);

    if (sum < 10) {
      result.next = node.next;
    } else {
      result.next = add(node.next, 1);
    }

    return result;
  }
}
