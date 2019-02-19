package com.leetcode.algorithm.medium.numberofboomerangs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.numberOfBoomerangs(new int[][] {
        {0, 0}, {1, 0}, {2, 0}
    }));
  }
}
