package com.leetcode.algorithm.medium.missingranges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("2", "4->49", "51->74", "76->99"),
        solution.findMissingRanges(new int[] {0, 1, 3, 50, 75}, 0, 99));
  }
}
