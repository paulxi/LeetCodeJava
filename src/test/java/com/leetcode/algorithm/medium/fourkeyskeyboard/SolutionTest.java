package com.leetcode.algorithm.medium.fourkeyskeyboard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxA(3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(9, solution.maxA(7));
  }
}
