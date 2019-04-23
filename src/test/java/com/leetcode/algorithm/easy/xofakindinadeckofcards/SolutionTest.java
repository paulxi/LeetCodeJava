package com.leetcode.algorithm.easy.xofakindinadeckofcards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.hasGroupsSizeX(new int[] {1, 2, 3, 4, 4, 3, 2, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertFalse(solution.hasGroupsSizeX(new int[] {1, 1, 1, 2, 2, 2, 3, 3}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertFalse(solution.hasGroupsSizeX(new int[] {1}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertTrue(solution.hasGroupsSizeX(new int[] {1, 1}));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertTrue(solution.hasGroupsSizeX(new int[] {1, 1, 2, 2, 2, 2}));
  }
}
