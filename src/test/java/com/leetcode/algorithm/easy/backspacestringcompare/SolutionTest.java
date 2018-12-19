package com.leetcode.algorithm.easy.backspacestringcompare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.backspaceCompare("ab#c", "ad#c"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.backspaceCompare("ab##", "c#d#"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.backspaceCompare("a##c", "#a#c"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(false, solution.backspaceCompare("a#c", "b"));
  }
}
