package com.leetcode.algorithm.medium.permutationsequence;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("213", solution.getPermutation(3, 3));
  }
}
