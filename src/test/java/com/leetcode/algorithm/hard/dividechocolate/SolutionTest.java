package com.leetcode.algorithm.hard.dividechocolate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.maximizeSweetness(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.maximizeSweetness(new int[] {5, 6, 7, 8, 9, 1, 2, 3, 4}, 8));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(5, solution.maximizeSweetness(new int[] {1, 2, 2, 1, 2, 2, 1, 2, 2}, 2));
  }
}
