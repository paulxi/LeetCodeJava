package com.leetcode.algorithm.hard.countofsmallernumbersafterself;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(2, 1, 1, 0), solution.countSmaller(new int[] {5, 2, 6, 1}));
  }
}
