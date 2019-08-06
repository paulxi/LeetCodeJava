package com.leetcode.algorithm.easy.laststoneweight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.lastStoneWeight(new int[] {2,7,4,1,8,1}));
  }
}
