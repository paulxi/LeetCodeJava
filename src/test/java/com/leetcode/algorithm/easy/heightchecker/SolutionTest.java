package com.leetcode.algorithm.easy.heightchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3}));
  }
}
