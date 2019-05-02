package com.leetcode.algorithm.hard.zumagame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(-1, solution.findMinStep("WRRBBW", "RB"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.findMinStep("WWRRBBWW", "WRBRW"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(2, solution.findMinStep("G", "GGGGG"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(3, solution.findMinStep("RBYYBBRRB", "YRBGB"));
  }
}
