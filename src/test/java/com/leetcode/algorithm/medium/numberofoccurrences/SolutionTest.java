package com.leetcode.algorithm.medium.numberofoccurrences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.getIntCount(new int[] {1,2,3,3,4,4,4}, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.getIntCount(new int[] {1,2,3,3,4,4,4}, 4));
  }
}
