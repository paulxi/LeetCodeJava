package com.leetcode.algorithm.easy.maxconsecutiveones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
  }
}
