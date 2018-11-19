package com.leetcode.algorithm.easy.removeduplicatesfromsortedarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] input = {1, 1, 2};
    int length = solution.removeDuplicates(input);
    assertEquals(2, length);
    assertArrayEquals(new int[] {1, 2}, Arrays.copyOf(input, length));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int length = solution.removeDuplicates(input);
    assertEquals(5, length);
    assertArrayEquals(new int[] {0, 1, 2, 3, 4}, Arrays.copyOf(input, length));
  }
}
