package com.leetcode.algorithm.medium.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new char[][] {
          {'B', '1', 'E', '1', 'B'},
          {'B', '1', 'M', '1', 'B'},
          {'B', '1', '1', '1', 'B'},
          {'B', 'B', 'B', 'B', 'B'}
        },
        solution.updateBoard(
            new char[][] {
              {'E', 'E', 'E', 'E', 'E'},
              {'E', 'E', 'M', 'E', 'E'},
              {'E', 'E', 'E', 'E', 'E'},
              {'E', 'E', 'E', 'E', 'E'}
            },
            new int[] {3, 0}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new char[][] {
          {'B', '1', 'E', '1', 'B'},
          {'B', '1', 'X', '1', 'B'},
          {'B', '1', '1', '1', 'B'},
          {'B', 'B', 'B', 'B', 'B'}
        },
        solution.updateBoard(
            new char[][] {
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'}
            },
            new int[] {1, 2}));
  }
}
