package com.leetcode.algorithm.easy.arraypartitioni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.arrayPairSum(new int[] {1, 4, 3, 2}));
  }
}
