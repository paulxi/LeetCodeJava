package com.leetcode.algorithm.easy.baseballgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(30, solution.calPoints(new String[]{"5","2","C","D","+"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(27, solution.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
  }
}
