package com.leetcode.algorithm.medium.friendsofappropriateages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.numFriendRequests(new int[] {16, 16}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.numFriendRequests(new int[] {16, 17, 18}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.numFriendRequests(new int[] {20, 30, 100, 110, 120}));
  }
}
