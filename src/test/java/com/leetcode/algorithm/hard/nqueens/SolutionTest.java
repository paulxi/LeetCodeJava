package com.leetcode.algorithm.hard.nqueens;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
        Arrays.asList("..Q.", "Q...", "...Q", ".Q..")
    ), solution.solveNQueens(4));
  }
}
