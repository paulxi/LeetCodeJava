package com.leetcode.algorithm.medium.solvetheequation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("x=2", solution.solveEquation("x+5-3+x=6+x-2"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("Infinite solutions", solution.solveEquation("x=x"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("x=0", solution.solveEquation("2x=x"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("x=-1", solution.solveEquation("2x+3x-6x=x+2"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals("No solution", solution.solveEquation("x=x+2"));
  }
}
