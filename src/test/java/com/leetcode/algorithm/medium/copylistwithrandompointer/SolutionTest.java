package com.leetcode.algorithm.medium.copylistwithrandompointer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.RandomListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testTwoListNodes() {
    RandomListNode l1 = new RandomListNode(4);
    RandomListNode l2 = new RandomListNode(7);
    RandomListNode l3 = new RandomListNode(-2);
    l1.next = l2;
    l2.next = l3;
    l1.random = l3;
    l2.random = l1;

    Solution solution = new Solution();
    RandomListNode copyl1 = solution.copyRandomList(l1);
    RandomListNode copyl2 = copyl1.next;
    RandomListNode copyl3 = copyl2.next;

    assertEquals(l1.label, copyl1.label);
    assertEquals(l2.label, copyl2.label);
    assertEquals(l3.label, copyl3.label);
    assertEquals(copyl3, copyl1.random);
    assertEquals(copyl1, copyl2.random);
  }
}
