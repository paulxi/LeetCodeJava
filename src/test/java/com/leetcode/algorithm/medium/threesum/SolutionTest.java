package com.leetcode.algorithm.medium.threesum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    List<List<Integer>> result = solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4});

    List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1), Arrays.asList(-1, -1, 2));

    assertEquals(new HashSet<>(expected), new HashSet<>(result));
  }
}
