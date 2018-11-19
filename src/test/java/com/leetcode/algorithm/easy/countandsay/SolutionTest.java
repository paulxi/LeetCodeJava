package com.leetcode.algorithm.easy.countandsay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("1", solution.countAndSay(1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("1211", solution.countAndSay(4));
  }

}
