package com.leetcode.algorithm.medium.linkedlistrandomnode;

import com.leetcode.algorithm.common.ListNode;

import java.util.Random;

class Solution {
  ListNode head;
  Random rand;

  /** @param head The linked list's head.
  Note that the head is guaranteed to be not null, so it contains at least one node. */
  public Solution(ListNode head) {
    this.head = head;
    this.rand = new Random();
  }

  /** Returns a random node's value. */
  public int getRandom() {
    ListNode node = head;
    int result = node.val;
    for (int i = 1; node.next != null; i++) {
      node = node.next;
      if (rand.nextInt(i + 1) == i) {
        result = node.val;
      }
    }

    return result;
  }
}
