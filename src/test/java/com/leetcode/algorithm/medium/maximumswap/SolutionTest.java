package com.leetcode.algorithm.medium.maximumswap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7236, solution.maximumSwap(2736));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(9973, solution.maximumSwap(9973));
  }
}
