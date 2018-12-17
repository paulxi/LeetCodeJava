package com.leetcode.algorithm.medium.evaluatedivision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertArrayEquals(new double[]{6.0, 0.5, -1.0, 1.0, -1.0},
        solution.calcEquation(new String[][]{{"a", "b"}, {"b", "c"}},
            new double[]{2.0, 3.0},
            new String[][]{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}}
        ));
  }
}
