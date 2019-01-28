package com.leetcode.algorithm.medium.findminimuminrotatedsortedarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(1, solution.findMin(new int[] {3,4,5,1,2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(0, solution.findMin(new int[] {4,5,6,7,0,1,2}));
  }
}
