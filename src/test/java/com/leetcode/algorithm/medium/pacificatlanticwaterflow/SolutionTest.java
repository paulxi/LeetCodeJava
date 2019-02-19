package com.leetcode.algorithm.medium.pacificatlanticwaterflow;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<int[]> result = solution.pacificAtlantic(new int[][] {
        {1, 2, 2, 3, 5},
        {3, 2, 3, 4, 4},
        {2, 4, 5, 3, 1},
        {6, 7, 1, 4, 5},
        {5, 1, 1, 2, 4},
    });
    int[][] ans = new int[result.size()][2];
    result.toArray(ans);

    assertArrayEquals(new int[][] {
        {0, 4}, {1, 3}, {1, 4}, {2, 2},
        {3, 0}, {3, 1}, {4, 0}
    }, ans);
  }
}
