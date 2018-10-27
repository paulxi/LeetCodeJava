package com.leetcode.algorithm.medium.fruitintobaskets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3,
        solution.totalFruit(new int[] {1, 2, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3,
        solution.totalFruit(new int[] {0, 1, 2, 2}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4,
        solution.totalFruit(new int[] {1, 2, 3, 2, 2}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(5,
        solution.totalFruit(new int[] {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
  }
}
