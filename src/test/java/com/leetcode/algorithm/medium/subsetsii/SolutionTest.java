package com.leetcode.algorithm.medium.subsetsii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<List<Integer>> result = solution.subsetsWithDup(new int[] {1, 2, 2});
    assertEquals(6, result.size());
  }
}
