package com.leetcode.algorithm.easy.removeelement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.removeElement(new int[] {3,2,2,3}, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(5, solution.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
  }
}
