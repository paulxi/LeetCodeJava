package com.leetcode.algorithm.medium.kthsymbolingrammar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0, solution.kthGrammar(1, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.kthGrammar(2, 1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.kthGrammar(2, 2));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(1, solution.kthGrammar(4, 5));
  }
}
