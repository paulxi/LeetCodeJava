package com.leetcode.algorithm.medium.sequencereconstruction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.sequenceReconstruction(new int[] {1,2,3}, Arrays.asList(
        Arrays.asList(1, 2),
        Arrays.asList(1, 3)
    )));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.sequenceReconstruction(new int[] {1,2,3}, Arrays.asList(
        Arrays.asList(1, 2)
    )));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.sequenceReconstruction(new int[] {1,2,3}, Arrays.asList(
        Arrays.asList(1, 2),
        Arrays.asList(1, 3),
        Arrays.asList(2, 3)
    )));
  }
}
