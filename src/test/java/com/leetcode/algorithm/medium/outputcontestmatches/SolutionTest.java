package com.leetcode.algorithm.medium.outputcontestmatches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("(1,2)", solution.findContestMatch(2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("((1,4),(2,3))", solution.findContestMatch(4));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("(((1,8),(4,5)),((2,7),(3,6)))", solution.findContestMatch(8));
  }
}
