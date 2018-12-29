package com.leetcode.algorithm.medium.reorderlist;

import com.leetcode.algorithm.common.ListNode;

import java.util.List;

class Solution {
//  public void reorderList(ListNode head) {
//    rearrange(head);
//  }
//
//  private void rearrange(ListNode head) {
//    if (head == null || head.next == null) {
//      return;
//    }
//
//    ListNode tail = head;
//    ListNode pretail = null;
//    while (tail.next != null) {
//      pretail = tail;
//      tail = tail.next;
//    }
//
//    pretail.next = null;
//    tail.next = head.next;
//    head.next = tail;
//
//    if (tail.next != null) {
//      rearrange(tail.next);
//    }
//  }

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }

    // Find the middle of the list
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Reverse the second half
    // 1->2->3->4->5->6 to 1->2->3 and 6->5->4
    ListNode head2 = reverse(slow.next);
    slow.next = null;

    // Link the two halves together
    // 1->2->3 and 6->5->4 to 1->6->2->5->3->4
    while (head != null && head2 != null) {
      ListNode tmp1 = head.next;
      ListNode tmp2 = head2.next;

      head2.next = head.next;
      head.next = head2;

      head = tmp1;
      head2 = tmp2;
    }
  }

  ListNode reverse(ListNode node) {
    ListNode prev = null;
    ListNode cur = node;
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }

    return prev;
  }
}
