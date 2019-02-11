package com.leetcode.algorithm.medium.findkpairswithsmallestsums;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<int[]> result = solution.kSmallestPairs(new int[] {1, 7, 11}, new int[] {2, 4, 6}, 3);
    assertEquals(3, result.size());
    assertArrayEquals(new int[] {1, 2}, result.get(0));
    assertArrayEquals(new int[] {1, 4}, result.get(1));
    assertArrayEquals(new int[] {1, 6}, result.get(2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<int[]> result = solution.kSmallestPairs(new int[] {1, 1, 2}, new int[] {1, 2, 3}, 2);
    assertEquals(2, result.size());
    assertArrayEquals(new int[] {1, 1}, result.get(0));
    assertArrayEquals(new int[] {1, 1}, result.get(1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    List<int[]> result = solution.kSmallestPairs(new int[] {1, 2}, new int[] {3}, 3);
    assertEquals(2, result.size());
    assertArrayEquals(new int[] {1, 3}, result.get(0));
    assertArrayEquals(new int[] {2, 3}, result.get(1));
  }
}
