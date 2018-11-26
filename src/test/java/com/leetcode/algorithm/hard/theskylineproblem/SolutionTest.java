package com.leetcode.algorithm.hard.theskylineproblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[][] input = new int[][] {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
    List<int[]> output = solution.getSkyline(input);
    List<int[]> expected = Arrays.asList(
        new int[] {2, 10}, new int[] {3, 15},
        new int[] {7, 12}, new int[] {12, 0},
        new int[] {15, 10}, new int[] {20, 8},
        new int[] {24, 0}
    );

    assertArrayEquals(expected.toArray(), output.toArray());
  }
}
