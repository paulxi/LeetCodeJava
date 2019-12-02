package com.leetcode.algorithm.easy.longpressedname;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.isLongPressedName("alex", "aaleex"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertFalse(solution.isLongPressedName("saeed", "ssaaedd"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertTrue(solution.isLongPressedName("leelee", "lleeelee"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertTrue(solution.isLongPressedName("laiden", "laiden"));
  }
}
