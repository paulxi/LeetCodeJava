package com.leetcode.algorithm.hard.cutofftreesforgolfevent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.cutOffTree(Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(0, 0, 4),
        Arrays.asList(7, 6, 5)
    )));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.cutOffTree(Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(0, 0, 0),
        Arrays.asList(7, 6, 5)
    )));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(6, solution.cutOffTree(Arrays.asList(
        Arrays.asList(2, 3, 4),
        Arrays.asList(0, 0, 5),
        Arrays.asList(7, 6, 5)
    )));
  }
}
