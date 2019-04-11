package com.leetcode.algorithm.medium.combinations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(1, 3),
            Arrays.asList(1, 4),
            Arrays.asList(2, 3),
            Arrays.asList(2, 4),
            Arrays.asList(3, 4)),
        solution.combine(4, 2));
  }
}
