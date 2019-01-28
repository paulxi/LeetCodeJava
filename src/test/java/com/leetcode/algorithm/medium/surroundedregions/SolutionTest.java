package com.leetcode.algorithm.medium.surroundedregions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    char[][] board = new char[][] {
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}
    };

    char[][] expected = new char[][] {
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'X', 'X'}
    };

    Solution solution = new Solution();
    solution.solve(board);
    assertArrayEquals(expected, board);
  }

  @Test
  public void testCase2() {
    char[][] board = new char[][] {
        {'X','O','X','O','X','O'},
        {'O','X','O','X','O','X'},
        {'X','O','X','O','X','O'},
        {'O','X','O','X','O','X'}
    };

    char[][] expected = new char[][] {
        {'X','O','X','O','X','O'},
        {'O','X','X','X','X','X'},
        {'X','X','X','X','X','O'},
        {'O','X','O','X','O','X'}
    };

    Solution solution = new Solution();
    solution.solve(board);
    assertArrayEquals(expected, board);
  }
}
