package com.leetcode.algorithm.easy.pascalstriangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList(1),
        Arrays.asList(1, 1),
        Arrays.asList(1, 2, 1),
        Arrays.asList(1, 3, 3, 1),
        Arrays.asList(1, 4, 6, 4, 1)
    ), solution.generate(5));
  }
}
