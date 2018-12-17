package com.leetcode.algorithm.medium.linkedlistrandomnode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);

    Solution solution = new Solution(listNode);

    assertEquals(true, Arrays.asList(1, 2, 3).contains(solution.getRandom()));
  }
}
