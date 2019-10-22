package com.leetcode.algorithm.hard.criticalconnectionsinanetwork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList(1, 3)), solution.criticalConnections(4, Arrays.asList(
        Arrays.asList(0, 1),
        Arrays.asList(1, 2),
        Arrays.asList(2, 0),
        Arrays.asList(1, 3)
    )));
  }
}
