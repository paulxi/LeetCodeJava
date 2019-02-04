package com.leetcode.algorithm.easy.firstbadversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    solution.predicate = (a) -> a >= 4;
    assertEquals(4, solution.firstBadVersion(5));
  }
}
