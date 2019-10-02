package com.leetcode.algorithm.medium.numberofdicerollswithtargetsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.numRollsToTarget(1, 6, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.numRollsToTarget(2, 6, 7));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.numRollsToTarget(2, 5, 10));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(0, solution.numRollsToTarget(1, 2, 3));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(222616187, solution.numRollsToTarget(30, 30, 500));
  }
}
