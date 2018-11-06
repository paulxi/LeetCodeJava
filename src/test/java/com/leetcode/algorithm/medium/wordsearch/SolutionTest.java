package com.leetcode.algorithm.medium.wordsearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    char[][] board = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };
    assertEquals(true, solution.exist(board, "ABCCED"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    char[][] board = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };
    assertEquals(true, solution.exist(board, "SEE"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    char[][] board = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };
    assertEquals(false, solution.exist(board, "ABCB"));
  }
}
