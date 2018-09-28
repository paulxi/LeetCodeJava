package com.leetcode.algorithm.hard.mergeksortedlists;

import com.leetcode.algorithm.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt((ListNode node) -> node.val));
    for (ListNode node : lists) {
      if (node != null) {
        queue.add(node);
      }
    }

    ListNode result = null;
    ListNode previous = null;
    while (!queue.isEmpty()) {
      ListNode node = queue.poll();
      if (result == null) {
        result = node;
      } else {
        previous.next = node;
      }
      if (node.next != null) {
        queue.add(node.next);
      }
      previous = node;
    }

    return result;
  }
}
