package com.leetcode.algorithm.medium.exclusivetimeoffunctions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, 4}, solution.exclusiveTime(2, Arrays.asList(
        "0:start:0",
        "1:start:2",
        "1:end:5",
        "0:end:6"
    )));
  }
}
